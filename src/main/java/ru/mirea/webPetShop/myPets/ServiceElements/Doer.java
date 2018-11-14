package ru.mirea.webPetShop.myPets.ServiceElements;

/**
 * Класс, который описывает деятеля системы.
 * Часто в других системах называется {@code User}.
 */
public class Doer {

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
    enum Role {
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
