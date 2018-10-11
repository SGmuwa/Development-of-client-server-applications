package ru.mirea.webPetShop.myPets.ServiceElements;

/**
 * Валюта
 */
public class Currency {
    private double convert;
    private String nameFrom;
    private String nameTo;

    public Currency(double convert, String nameFrom, String nameTo) {
        this.convert = convert;
        this.nameFrom = nameFrom;
        this.nameTo = nameTo;
    }

    public void setConvert(double convert) {
        this.convert = convert;
    }

    public void setNameFrom(String nameFrom) {
        this.nameFrom = nameFrom;
    }

    public void setNameTo(String nameTo) {
        this.nameTo = nameTo;
    }
}
