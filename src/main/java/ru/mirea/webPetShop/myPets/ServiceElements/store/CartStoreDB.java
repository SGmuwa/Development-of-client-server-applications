package ru.mirea.webPetShop.myPets.ServiceElements.store;

import ru.mirea.webPetShop.myPets.ServiceElements.Balance;
import ru.mirea.webPetShop.myPets.ServiceElements.Cart;
import ru.mirea.webPetShop.myPets.ServiceElements.CartElement;
import ru.mirea.webPetShop.myPets.ServiceElements.Doer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class CartStoreDB implements IStorage<Cart, Integer> {

    private Connection connection;

    public CartStoreDB(Connection connection) {
        this.connection = connection;
    }

    /**
     * Получение списка всех элементов таблицы.
     *
     * @return Коллекция всех элементов таблицы.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public Collection<Cart> values() throws SQLException {
        ArrayList<CartElement> items = new ArrayList<>();
        try (final Statement statement = this.connection.createStatement();
             final ResultSet rs = statement.executeQuery("SELECT * FROM cartElements")) {
            while (rs.next()) {
                items.add(new Cart(
                        rs.getInt("id"),
                        rs.getInt("item_id")
                ));
            }
        }
    }

    public ArrayList<Integer> keys() throws SQLException {
        ArrayList<Integer> items = new ArrayList<>();
        try (final Statement statement = this.connection.createStatement();
             final ResultSet rs = statement.executeQuery("SELECT DISTINCT user_id FROM cartElements")) {
            while (rs.next()) {
                items.add(new Cart(
                        rs.getInt("id"),
                        rs.getInt("item_id")
                ));
            }
        }
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
    public Integer add(Cart cartElement) throws SQLException {
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
    public void addCompletely(Cart cartElement) throws SQLException {

    }

    /**
     * Получение элемента по заданному ключу.
     *
     * @param id Значение ключа требуемого элемента.
     * @return Элемент по заданному ключу.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public Cart get(Integer id) throws SQLException {
        try (final PreparedStatement statement =
                     this.connection.prepareStatement("SELECT * FROM cartElements WHERE id = ?")) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
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
    public void replace(Integer id, Cart newElement) throws SQLException {

    }

    /**
     * Обновляет элемент: находит элемент по {@code newElement.key} и заменяет оставшиеся поля.
     *
     * @param newElement Элемент, который необходимо обновить.
     * @throws SQLException Элемент не найден или подключение разорвано.
     */
    @Override
    public void update(Cart newElement) throws SQLException {

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
    public void delete(Integer id, Cart cartElement) throws SQLException {

    }
}
