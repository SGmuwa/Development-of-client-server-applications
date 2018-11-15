package ru.mirea.webPetShop.myPets.ServiceElements;

/**
 * Класс, который описывает деятеля системы.
 * Часто в других системах называется {@code User}.
 */
public class Doer {

    public Doer(int id, Role role, Balance balance, Cart cart) {
        this.id = id;
        this.role = role;
        this.balance = balance;
        this.cart = cart;
    }

    protected int id;

    protected Role role;

    protected Balance balance;

    protected Cart cart;

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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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
