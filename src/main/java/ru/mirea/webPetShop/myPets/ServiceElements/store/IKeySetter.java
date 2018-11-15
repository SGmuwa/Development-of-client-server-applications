package ru.mirea.webPetShop.myPets.ServiceElements.store;

import java.sql.Statement;

public interface IKeySetter<Base> {
    /**
     * Вставляет в запрос значение класса Base.
     * @param field Порядковый номер вопросительного знака,
     *              куда надо вставить значение.
     * @param value Значение, которое необходимо подставить.
     */
    void setToStatement(Statement statement, int field, Base value);
}
