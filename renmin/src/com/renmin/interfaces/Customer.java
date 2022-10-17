package com.renmin.interfaces;

public interface Customer {
    public String getCustomerId();

    /**
     *  购物前准备
     */
    public void startShopping();

    /**
     * 获取顾客感兴趣需要购买的商品的种类
     * @return
     */
    public Category chooseBuyCategory();

    public void buyMerchandise( Merchandise merchandise);

    /**
     * 是否继续逛超市
     * @return
     */
    public boolean wantToCheckOut();

    public void payMoney();

    public double getMoneySpent();



}
