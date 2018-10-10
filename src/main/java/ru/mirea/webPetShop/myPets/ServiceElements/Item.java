package ru.mirea.webPetShop.myPets.ServiceElements;

public class Item {
    private int id;
    private String name;
    private Types type;
    private int count;

    public Item(int id, String name, String type, int count) {
        this.id = id;
        this.name = name;
        if(type.equals(Types.Pet.name()))
            this.type = Types.Pet;
        else if(type.equals(Types.Stuff.name()))
            this.type = Types.Stuff;
        else
            this.type = Types.notSupprt;
    }

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

    public String getType() {
        switch (type) {
            case Pet:
                return "Pet";
            case Stuff:
                return "Stuff";
            default:
                return "Not support";
        }
    }

    public int getCount() {
        return count;
    }

    enum Types {
        notSupprt,
        Pet,
        Stuff
    }
}
