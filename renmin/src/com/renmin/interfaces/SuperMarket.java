package com.renmin.interfaces;

public interface SuperMarket {

    public Merchandise[] getAllMerchandise();
    public Merchandise[] getRandomMerchandiseOfCategory( Category category);
    public void addEarnMoney(double earnMoney);
    public void dailyReport();
    public String getName();
}
