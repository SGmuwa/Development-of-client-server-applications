package ru.mirea.webPetShop.myPets.ServiceElements.store;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Интерфейс обозначает, что класс является хранилищем базы данных.
 * @author parsentev, [SG]Muwa (SGmuwa)
 * @since 29.04.2015, 15.11.2018
 *
 * @param <Element> Тип, который символизирует поля строки, включая ключ.
 * @param <Key> Тип, который символизирует ключ таблицы.
 */
public abstract class IStorageDB<Element, Key> implements AutoCloseable, IStorage<Element, Key> {

    protected final IKeyGetter<Key> keyGetter;
    protected final IKeySetter<Key> keySetter;
    protected final Connection connection;

    protected <KeyGetter extends IKeyGetter<Key>, KeySetter extends IKeySetter<Key>>
    IStorageDB(KeyGetter keyGetter, KeySetter keySetter, Connection connection) {
        this.keyGetter = keyGetter;
        this.keySetter = keySetter;
        this.connection = connection;
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }
}