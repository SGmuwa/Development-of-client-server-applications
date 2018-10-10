package ru.mirea.webPetShop.myPets.ServiceElements;

public class CartElement {
    private int id;
    private Item item;

    public CartElement(int id, Item item) {
        this.id = id;
        this.item = item;
    }
}
