package com.company;
import java.util.*;
public class main {
    public static void main(String[] args) {
        FulfillmentCenter test = new FulfillmentCenter("Glowny", 500);

        test.addProduct(new Item("Sam", ItemCondition.USED, 3,5));
        test.addProduct(new Item("Cos", ItemCondition.REFURBISHED, 2, 10));
        test.addProduct(new Item("Ere", ItemCondition.NEW, 1, 3));
        test.addProduct(new Item("Rsdfam", ItemCondition.USED, 3,5));
        test.addProduct(new Item("Qwam", ItemCondition.USED, 3,5));
        test.addProduct(new Item("Cham", ItemCondition.USED, 3,5));
        test.sortByName();
        test.summary();
        System.out.println();
        test.sortByAmount();
        test.summary();
        System.out.println(test.countByCondition(ItemCondition.USED));
        test.getProduct(new Item("Cham", ItemCondition.USED, 3,5));
        test.summary();
    }
}
