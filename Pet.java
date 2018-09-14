package lab1.lab1;

class Pet {
    int id;
    int count;
    String type;

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
