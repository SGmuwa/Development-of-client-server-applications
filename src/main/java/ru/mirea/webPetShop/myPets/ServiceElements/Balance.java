package ru.mirea.webPetShop.myPets.ServiceElements;

public class Balance {

    public Balance(int penny) {
        this.penny = penny;
    }

    /**
     * Хранит количество копеек.
     */
    private int penny;

    int getPenny() {
        return penny;
    }
}
