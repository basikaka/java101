package com.renmin.interfaces.impl;

import com.renmin.interfaces.Category;
import com.renmin.interfaces.Merchandise;

public class MerchandiseImpl implements Merchandise {
    private String name;
    private Category category;
    private int count;
    private double purchasePrice;
    private double soldPrice;


    public MerchandiseImpl(String name,
                           Category category,
                           int count,
                           double purchasePrice,
                           double soldPrice) {
        this.name = name;
        this.category = category;
        this.count = count;
        this.purchasePrice = purchasePrice;
        this.soldPrice = soldPrice;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Category getCategory() {
        return this.category;
    }

    @Override
    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    @Override
    public double getSoldPrice() {
        return this.soldPrice;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public int buy(int count) {
        if(count > this.count){
            return -1;
        }
        this.count -= count;
        return  count;
    }

    @Override
    public void putBack(int count) {
        this.count += count;
    }


}
