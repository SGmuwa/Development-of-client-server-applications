package ru.mirea.webPetShop.myPets.ServiceElements.store;

import java.sql.Statement;

/**
 * Интерфейс, который указывает на то, что наследники умеют
 * преобразовываться из Statement в базовый тип.
 */
public interface IKeyGetter<Base> {
    Base GetFromStatement(Statement statement, String nameField);
}
