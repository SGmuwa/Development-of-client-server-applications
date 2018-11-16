package ru.mirea.webPetShop.myPets.ServiceElements;

import ru.mirea.webPetShop.myPets.ServiceElements.store.CartStoreDB;

/**
 * Класс, который описывает деятеля системы.
 * Часто в других системах называется {@code User}.
 */
public class Doer {

    public Doer(int id, Role role, Balance balance, CartStoreDB cartStoreDB) {
        this.id = id;
        this.role = role;
        this.balance = balance;
        this.cart = cartStoreDB;
    }

    protected int id;

    protected Role role;

    protected Balance balance;

    protected CartStoreDB cart;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public CartStoreDB getCart() {
        return cart;
    }

    public void setCart(CartStoreDB cart) {
        this.cart = cart;
    }

    public Integer getId() {
        return id;
    }

    /**
     * Класс, который описывает уровени привелегий клиента.
     */
    public enum Role {
        /**
         * Роль неизвестна
         */
        Anon,
        /**
         * Пользователь
         */
        User,
        /**
         * Администратор
         */
        Admin,
        /**
         * Системный уровень
         */
        Root
    }
}
