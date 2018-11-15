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
public interface IStorageDB<Element, Key> extends AutoCloseable, IStorage<Element, Key> {

}