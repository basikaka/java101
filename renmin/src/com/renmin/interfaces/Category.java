package com.renmin.interfaces;

public enum Category {
    SNACK(4,100),
    PHONE(1000,2000),
    ELECTRIC(1000,10000),
    FRESH(2,200),
    FOOD(1,400),
    FRUIT(10,100),
    CLOTHES(10,1000),
    BOOK(20,800),
    COOK(40,6000);

    private int lowPrice;
    private int higherPrice;

    Category(int lowPrice, int higherPrice) {
        this.lowPrice = lowPrice;
        this.higherPrice = higherPrice;
    }

    public int getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(int lowPrice) {
        this.lowPrice = lowPrice;
    }

    public int getHigherPrice() {
        return higherPrice;
    }

    public void setHigherPrice(int higherPrice) {
        this.higherPrice = higherPrice;
    }
}
