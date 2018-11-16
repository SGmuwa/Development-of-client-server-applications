package ru.mirea.webPetShop.myPets.ServiceElements.store;

import ru.mirea.webPetShop.myPets.ServiceElements.Balance;
import ru.mirea.webPetShop.myPets.ServiceElements.CartElement;
import ru.mirea.webPetShop.myPets.ServiceElements.Doer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class CartStoreDB implements IStorage<CartElement, Integer> {

    private int id;
    private Doer user;
    private Connection connection;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doer getUser() {
        return user;
    }

    public void setUser(Doer user) {
        this.user = user;
    }

    public CartStoreDB(int id, Doer user, Connection connection) {
        this.id = id;
        this.user = user;
        this.connection = connection;
    }

    /**
     * Получение списка всех элементов таблицы.
     *
     * @return Коллекция всех элементов таблицы.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public Collection<CartElement> values() throws SQLException {
        return null;
    }

    /**
     * Добавить в таблицу данные.
     * Ключ автоматически генерируется. Поле {@code element.key} игнорируется.
     *
     * @param cartElement элемент, который необходимо добавить.
     * @return Ключ, полученный от базы данных.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public Integer add(CartElement cartElement) throws SQLException {
        return null;
    }

    /**
     * Добавить таблицу данные с определённым ключом.
     * Поле Element.key учавствует в добавлении.
     *
     * @param cartElement Элемент, который необходимо добавить.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public void addCompletely(CartElement cartElement) throws SQLException {

    }

    /**
     * Получение элемента по заданному ключу.
     *
     * @param id Значение ключа требуемого элемента.
     * @return Элемент по заданному ключу.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public CartElement get(Integer id) throws SQLException {
        try (final Statement statement = this.connection.createStatement();
             final ResultSet rs = statement.executeQuery("SELECT * FROM carts")) {
            if (rs.next()) {
                return new CartElement(
                        rs.getInt("id"),
                        rs.getInt("item_id")
                );
            }
        }
        throw new IllegalStateException(String.format("Cart %s does not exists", id));
    }

    /**
     * Заменяет элемент по заданному ключу.
     * Поле {@code newElement.key} также учавствует в замене.
     *
     * @param id         Ключ, который соответсвует элементу, который необходимо заменить.
     * @param newElement Новый элемент.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public void replace(Integer id, CartElement newElement) throws SQLException {

    }

    /**
     * Обновляет элемент: находит элемент по {@code newElement.key} и заменяет оставшиеся поля.
     *
     * @param newElement Элемент, который необходимо обновить.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public void update(CartElement newElement) throws SQLException {

    }

    /**
     * Удаляет строку из БД по ключу записи.
     *
     * @param id Ключ записи.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public void delete(Integer id) throws SQLException {

    }

    /**
     * Удаляет строку из БД по элементу и ключу.
     *
     * @param id          Ключ записи.
     * @param cartElement Элемент записи.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public void delete(Integer id, CartElement cartElement) throws SQLException {

    }
}
