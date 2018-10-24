package ru.mirea.webPetShop.myPets.ServiceElements;

public class CartElement {
    private long id;
    private long person_id;
    private long item_id;

    public CartElement(long id, long person_id, long item_id) {
        this.id = id;
        this.person_id = person_id;
        this.item_id = item_id;
    }

    public long getId() {
        return id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public long getItem_id() {
        return item_id;
    }
}
