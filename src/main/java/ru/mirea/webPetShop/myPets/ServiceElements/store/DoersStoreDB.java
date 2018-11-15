package ru.mirea.webPetShop.myPets.ServiceElements.store;

import jdk.javadoc.internal.doclets.formats.html.markup.HtmlAttr;
import ru.mirea.webPetShop.myPets.ServiceElements.Balance;
import ru.mirea.webPetShop.myPets.ServiceElements.Doer;

import java.io.Closeable;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DoersStoreDB implements IStorageDB<Doer, Integer> {

    private Connection connection;
    public final CartStoreDB cartDB;

    public DoersStoreDB(Connection connection, CartStoreDB cartDB) {
        setConnection(connection);
        this.cartDB = cartDB;
    }

    /**
     * Присваивание нового подключения.
     * @param connection Новое подключение.
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Collection<Doer> values() {
        final List<Doer> users = new ArrayList<>();
        try (final Statement statement = this.connection.createStatement();
             final ResultSet rs = statement.executeQuery("SELECT * FROM users")) {
            while (rs.next()) {
                users.add(new Doer(
                        rs.getInt("id"),
                        Doer.Role.valueOf(rs.getString("role")),
                        new Balance(rs.getLong("balance")),
                        cartDB.get(rs.getInt("cart_id")))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public Integer add(Doer user) {
        try (final PreparedStatement statement = this.connection.prepareStatement("INSERT INTO users (role, balance, cart_id) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, user.getRole().name());
            statement.setLong(2, user.getBalance().getPenny());
            statement.setInt(3, user.getCart().getId());
            statement.executeUpdate();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not create new user");
    }

    /**
     * Добавить таблицу данные с определённым ключом.
     * Поле Element.key учавствует в добавлении.
     *
     * @param doer Элемент, который необходимо добавить.
     */
    @Override
    public void addCompletely(Doer doer) {
        throw new
    }

    @Override
    public Doer get(Integer id) throws SQLException {
        try (final Statement statement = this.connection.createStatement();
             final ResultSet rs = statement.executeQuery("SELECT * FROM users")) {
            while (rs.next()) {
                return new Doer(
                        rs.getInt("id"),
                        Doer.Role.valueOf(rs.getString("role")),
                        new Balance(rs.getLong("balance")),
                        cartDB.get(rs.getInt("cart_id")));
            }
        }
        throw new IllegalStateException(String.format("User %s does not exists", id));
    }

    @Override
    public void replace(Integer id, Doer user) throws Exception {
        try(final PreparedStatement statement = this.connection
                .prepareStatement("UPDATE users SET role = ?, balance = ?, cart_id = ? WHERE id = ?")) {
            statement.setString(1, user.getRole().name());
            statement.setLong(2, user.getBalance().getPenny());
            statement.setInt(3, user.getCart().getId());
            statement.setInt(4, id);
            statement.executeUpdate();
        }
    }

    /**
     * Обновляет элемент: находит элемент по {@code newElement.key} и заменяет оставшиеся поля.
     *
     * @param newElement Элемент, который необходимо обновить.
     */
    @Override
    public void update(Doer newElement) {
        replace(newElement.getId(), newElement);
    }

    @Override
    public void delete(Integer id) {

    }

    /**
     * Closes this resource, relinquishing any underlying resources.
     * This method is invoked automatically on objects managed by the
     * {@code try}-with-resources statement.
     *
     * <p>While this interface method is declared to throw {@code
     * Exception}, implementers are <em>strongly</em> encouraged to
     * declare concrete implementations of the {@code close} method to
     * throw more specific exceptions, or to throw no exception at all
     * if the close operation cannot fail.
     *
     * <p> Cases where the close operation may fail require careful
     * attention by implementers. It is strongly advised to relinquish
     * the underlying resources and to internally <em>mark</em> the
     * resource as closed, prior to throwing the exception. The {@code
     * close} method is unlikely to be invoked more than once and so
     * this ensures that the resources are released in a timely manner.
     * Furthermore it reduces problems that could arise when the resource
     * wraps, or is wrapped, by another resource.
     *
     * <p><em>Implementers of this interface are also strongly advised
     * to not have the {@code close} method throw {@link
     * InterruptedException}.</em>
     * <p>
     * This exception interacts with a thread's interrupted status,
     * and runtime misbehavior is likely to occur if an {@code
     * InterruptedException} is {@linkplain Throwable#addSuppressed
     * suppressed}.
     * <p>
     * More generally, if it would cause problems for an
     * exception to be suppressed, the {@code AutoCloseable.close}
     * method should not throw it.
     *
     * <p>Note that unlike the {@link Closeable#close close}
     * method of {@link Closeable}, this {@code close} method
     * is <em>not</em> required to be idempotent.  In other words,
     * calling this {@code close} method more than once may have some
     * visible side effect, unlike {@code Closeable.close} which is
     * required to have no effect if called more than once.
     * <p>
     * However, implementers of this interface are strongly encouraged
     * to make their {@code close} methods idempotent.
     *
     * @throws Exception if this resource cannot be closed
     */
    @Override
    public void close() throws Exception {
        connection.close();
    }
}
