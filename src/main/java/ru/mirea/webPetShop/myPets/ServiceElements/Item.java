package ru.mirea.webPetShop.myPets.ServiceElements;

public class Item {
    private int id;
    private String name;
    private Types type;
    private int count;

    public Item(int id, String name, Types type, int count) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public enum Types {
        notSupprt,
        Pet,
        Stuff
    }
}
