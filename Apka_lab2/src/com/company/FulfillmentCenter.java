package com.company;

import java.util.LinkedList;
import java.util.List;

public class FulfillmentCenter {
    private String name;
    private List<Item> itemList;
    private double capacity;
    private double currentWeight;

    FulfillmentCenter(String nameToAdd, double capacityToAdd) {
        if (capacityToAdd <= 0)
            throw new IllegalArgumentException("Argument <= 0");

        name = nameToAdd;
        capacity = capacityToAdd;
        currentWeight = 0;
        List<Item> itemList = new LinkedList<>();
    }

    void addProduct(Item toAdd) {
        if (currentWeight + toAdd.getWeight() <= capacity)
            throw new IllegalArgumentException("Cannot add. Lack of capacity");

        int it = itemList.indexOf(toAdd);

        if (it == -1) {
            itemList.add(toAdd);
        } else {
            itemList.get(it).increaseWeight(toAdd.getWeight());
            itemList.get(it).increase();
        }

    }

    Item getProduct(Item toGet) {
        int it = itemList.indexOf(toGet);
        if (it == -1)
            throw new IllegalArgumentException("Cannot get. Item unfound");
        
    }
}
