package ru.mirea.webPetShop.myPets.ServiceElements;

import java.util.List;

public class Cart {
    private final Doer user;
    private final List<CartElement> elements;

    public Cart(Doer user, List<CartElement> elements) {
        this.user = user;
        this.elements = elements;
        if(this.elements == null)
            throw new NullPointerException("Поле elements должно быть проинициализировано!");
    }

    public Doer getDoer() {
        return user;
    }

    public CartElement getElement(int id) {
        return elements.get(id);
    }

    /**
     * Получает {@link #user}.{@link Doer#getId() getId()}.
     * @return Идентификатор пользователя, к которому привязана корзина.
     */
    public int getId() {
        return user.id;
    }

    public int getSize() {
        return elements.size();
    }
}
