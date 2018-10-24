package ru.mirea.webPetShop.myPets.ServiceElements;

public class Item {
    private long id;
    private String name;
    private Types type;
    private long count;
    private long cost;

    public Item(long id, String name, Types type, long count, long cost) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.count = count;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public long getCount() {
        return count;
    }

    public long getCost() {
        return cost;
    }

    public enum Types {
        notSupprt,
        Pet,
        Stuff
    }
}
