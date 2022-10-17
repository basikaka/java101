package com.renmin;

import com.renmin.interfaces.Merchandise;
import com.renmin.interfaces.SuperMarket;
import static com.renmin.util.ShoppingUtil.*;

public class ShoppingAppMain {
    public static void main(String[] args) {
        System.out.println("欢迎光临.");
        SuperMarket superMarket = createSuperMarket();
//        System.out.println(" 欢迎来到 "+ superMarket.getName());
//        Merchandise [] all = superMarket.getAllMerchandise();
//        for (Merchandise m:all) {
//            System.out.println(m.getCategory() + "\t" + m.getName() + "\t"
//            + m.getCount() + "\t" + m.getPurchasePrice() + "\t" + m.getSoldPrice());
//        }


    }
}
