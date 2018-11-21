package ru.mirea.webPetShop.myPets.ServiceElements;

import java.io.FileWriter;
import java.io.IOException;

public class CartElement {
    private int id;
    private int item_id;

    public CartElement(int id, int item_id) {
        this.id = id;
        this.item_id = item_id;
    }

    public int getId() {
        return id;
    }

    public int getItem_id() {
        return item_id;
    }
}
