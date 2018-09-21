package ru.mirea.webPetShop.myPets;

class Pet {
    private int id;
    protected int count;
    protected String type;

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public Pet(int id, int count, String type) {
        this.id = id;
        this.count = count;
        this.type = type;
    }
}
