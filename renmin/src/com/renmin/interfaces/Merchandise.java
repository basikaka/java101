package com.renmin.interfaces;

public interface Merchandise {

    public String getName();
    public Category getCategory();
    public double getPurchasePrice();
    public double getSoldPrice();
    public int getCount();
    public int buy(int count);
    public void putBack(int count);
}
