package ru.mirea.webPetShop.myPets.ServiceElements.store;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Интерфейс обозначает, что класс является хранилищем данных.
 * @author parsentev, [SG]Muwa (SGmuwa)
 * @since 29.04.2015, 15.11.2018
 *
 * @param <Element> Тип, который символизирует поля строки, включая ключ.
 * @param <Key> Тип, который символизирует ключ таблицы.
 */
public interface IStorage<Element, Key> {

    /**
     * Получение списка всех элементов таблицы.
     * @return Коллекция всех элементов таблицы.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    Collection<Element> values() throws Exception;

    /**
     * Добавить в таблицу данные.
     * Ключ автоматически генерируется. Поле {@code element.key} игнорируется.
     * @param element элемент, который необходимо добавить.
     * @return Ключ, полученный от базы данных.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    Key add(final Element element) throws Exception;

    /**
     * Добавить таблицу данные с определённым ключом.
     * Поле Element.key учавствует в добавлении.
     * @param element Элемент, который необходимо добавить.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    void addCompletely(final Element element) throws Exception;

    /**
     * Получение элемента по заданному ключу.
     * @param id Значение ключа требуемого элемента.
     * @return Элемент по заданному ключу.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    Element get(final Key id) throws Exception;

    /**
     * Заменяет элемент по заданному ключу.
     * Поле {@code newElement.key} также учавствует в замене.
     * @param id Ключ, который соответсвует элементу, который необходимо заменить.
     * @param newElement Новый элемент.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    void replace(final Key id, final Element newElement) throws Exception;

    /**
     * Обновляет элемент: находит элемент по {@code newElement.key} и заменяет оставшиеся поля.
     * @param newElement Элемент, который необходимо обновить.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    void update(final Element newElement) throws Exception;

    /**
     * Удаляет строку из БД по ключу записи.
     * @param id Ключ записи.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    void delete(final Key id) throws Exception;

    /**
     * Удаляет строку из БД по элементу и ключу.
     * @param element Элемент записи.
     * @param id Ключ записи.
     *
     * @throws Exception Элемент не найден или подключение разорвано.
     */
    void delete(final Key id, final Element element) throws Exception;
}
