package com.renmin.interfaces.impl;

import com.renmin.interfaces.Category;
import com.renmin.interfaces.Customer;
import com.renmin.interfaces.Merchandise;
import static com.renmin.util.ShoppingUtil.*;

public class CustomerImpl implements Customer {
    private String customerId;
    private Category shouldBuy;
    private double moneySpent;
    private int guangCount; //计划想买的数量（总的）
    private int leftCount; // 还差多少数量没有买的
    private static final int DAFAULT_GUANG_COUNT = 5;

    public CustomerImpl(String customerId,
                        Category shouldBuy) {
        this.customerId = customerId;
        this.shouldBuy = shouldBuy;
        this.moneySpent = moneySpent;
        this.guangCount = DAFAULT_GUANG_COUNT;

    }

    @Override
    public String getCustomerId() {
        return customerId;
    }

    @Override
    public void startShopping() {
        leftCount = guangCount;
    }

    @Override
    public Category chooseBuyCategory() {
        // 有一次机会看需要买的东西
        if( leftCount + 1 >= guangCount){
            return shouldBuy;
        }else {
            return  getRandomCategory();
        }
    }

    /**
     * 判断一下，购买的商品，有多大可能真的买
     * @param merchandise
     */
    @Override
    public void buyMerchandise(Merchandise merchandise) {
        Category category = merchandise.getCategory();
        if (category == shouldBuy){
            //return 1;
        }
    }

    @Override
    public boolean wantToCheckOut() {
        return false;
    }

    @Override
    public void payMoney() {

    }

    @Override
    public double getMoneySpent() {
        return 0;
    }
}
