package com.renmin.interfaces.impl;

import com.renmin.interfaces.Category;
import com.renmin.interfaces.Merchandise;
import com.renmin.interfaces.SuperMarket;
import com.renmin.util.*;

import static com.renmin.util.ShoppingUtil.output;

public class SuperMarketImpl implements SuperMarket {
    private String name ="人民超市";

    private Merchandise [] allMerchandise;
    private int []  allCount;
    private double totalMoneyEarn;
    private int customerCount;

    public SuperMarketImpl(Merchandise[] all) {
        this.allMerchandise = all;
        allCount = new int[ allMerchandise.length ];
        for (int i=0;i<allMerchandise.length;i++){
            allCount[i] = allMerchandise[i].getCount();
        }

    }


    @Override
    public Merchandise[] getAllMerchandise() {
        return allMerchandise;
    }

    @Override
    public Merchandise[] getRandomMerchandiseOfCategory(Category category) {
        Merchandise [] ret = new Merchandise[5];
        int pos = 0;
        for ( Merchandise m: allMerchandise ) {
            if( m.getCategory() == category
                    && Math.random() > 0.5
                    && pos < ret.length ){
                ret[pos] = m;
                pos++;
            }
        }

        return ret;
    }

    /**
     * 每个顾客购物结束后，进行营业额统计
     * @param earnMoney
     */
    @Override
    public void addEarnMoney(double earnMoney) {
        this.customerCount++;
        this.totalMoneyEarn += earnMoney;

    }

    @Override
    public void dailyReport() {
        output("营业总额为：" + totalMoneyEarn);
        output("商品出售情况：");
        for(int i =0; i < allCount.length; i++){
            if(allCount[i] != allMerchandise[i].getCount()){
                System.out.println( allMerchandise[i].getCategory().name()
                + '\t' + allMerchandise[i].getName()
                + '\t' + (allCount[i] - allMerchandise[i].getCount()));
            }
        }
    }

    public void setName( String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
