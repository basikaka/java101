package com.renmin.util;

import com.renmin.interfaces.Category;
import com.renmin.interfaces.Merchandise;
import com.renmin.interfaces.SuperMarket;
import com.renmin.interfaces.impl.MerchandiseImpl;
import com.renmin.interfaces.impl.SuperMarketImpl;

import java.util.Scanner;

public class ShoppingUtil {

    private static final Scanner in = new Scanner( System.in);
    public static Scanner input() { return  in; }
    public static void output( Object obj){
        System.out.println( String.valueOf( obj ));
    }

    public static SuperMarket createSuperMarket(){
        //假设每个商品类，有20种商品在售
        int merchandisePerCategory = 12;
        Merchandise [ ] all = new Merchandise[ merchandisePerCategory * Category.values().length ];
        for (Category category: Category.values() ) {
            for(int i=0; i<merchandisePerCategory; i++){
                double soldPrice = Math.random() * ( category.getHigherPrice() - category.getLowPrice())
                        + category.getLowPrice();
                double purchasePrice = soldPrice * 0.7;
                all[ category.ordinal() * merchandisePerCategory + i] = new MerchandiseImpl(
                        category.name() +i, category, 200, purchasePrice, soldPrice
                );

            }
        }

        SuperMarketImpl superMarket = new SuperMarketImpl( all );

        output("请给超市取名：");
        String name = input().next();

        if (name.trim().length() > 0){
            superMarket.setName( name.trim() );
        }

        return superMarket;
    }

    public static Category getRandomCategory(){
        return  Category.values()[ (int)(Math.random() * 1000 % Category.values().length) ];
    }
}
