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
        test.addProduct(new Item("Ctam", ItemCondition.USED, 3,5));
        List<Item> tmp = test.sortByAmount();
        for (Item it : tmp) {
            it.print();
        }

        System.out.println();
        tmp = test.sortByName();
        for (Item it : tmp) {
            it.print();
        }
        System.out.println(test.countByCondition(ItemCondition.USED));
        test.getProduct(new Item("Ctam", ItemCondition.USED, 3,5));
        test.summary();
        System.out.println();
        List<Item> temp = test.searchPartial("C");
        for (Item it : temp) {
            it.print();
        }
        System.out.println();
        FulfillmentCenterContainer a = new FulfillmentCenterContainer();
        a.addCenter("Glowny", 500);
        a.addCenter("Redgs",453);

        a.removeCenter("Glowny");
        a.summary();
    }
}
