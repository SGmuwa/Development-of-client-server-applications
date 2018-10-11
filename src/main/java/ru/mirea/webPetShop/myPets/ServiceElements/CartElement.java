package ru.mirea.webPetShop.myPets.ServiceElements;

public class CartElement {
    private int id;
    private int person_id;
    private int item_id;

    public CartElement(int id, int person_id, int item_id) {
        this.id = id;
        this.person_id = person_id;
        this.item_id = item_id;
    }

    public int getId() {
        return id;
    }

    public int getPerson_id() {
        return person_id;
    }

    public int getItem_id() {
        return item_id;
    }
}
