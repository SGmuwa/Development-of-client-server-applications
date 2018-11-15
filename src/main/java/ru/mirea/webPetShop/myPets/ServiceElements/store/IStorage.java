package ru.mirea.webPetShop.myPets.ServiceElements.store;

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
    Collection<Element> values();
    Key add(final Element user);
    Element get(final Key id);
    void edit(final Key id, final Element newElement);
    void delete(final Key id);
    Key generateId();
}
