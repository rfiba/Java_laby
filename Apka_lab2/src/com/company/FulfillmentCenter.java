package com.company;

import java.util.Collections;
import java.util.Comparator;
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

        if (itemList.get(it).getAmount() ==1)
            itemList.remove(it);

        itemList.get(it).decrease();
        return itemList.get(it);
    }

    Item removeProduct(Item toRemove) {
        int it = itemList.indexOf(toRemove);
        if (it == -1)
            throw new IllegalArgumentException("Cannot remove. Item unfound");

        return itemList.remove(it);
    }

    Item search(String toFind) {
     return null;
    }

    void sortByName() {
        itemList.sort(Item::compareTo);
    }

    void sortByAmount() {
        itemList.sort(new Comparator<Item>() {
            @Override
            public  int compare(Item o1, Item o2) {
                return -Integer.compare(o1.getAmount(), o2.getAmount());
            }
        });
    }

    Item max() {
        return Collections.max(itemList, new Comparator<Item>() {
            @Override
            public  int compare(Item o1, Item o2) {
                return Integer.compare(o1.getAmount(), o2.getAmount());
            }
        });
    }

    void summary() {
        for (Item v: itemList) {
            v.print();
        }
    }

    int countByCondition(ItemCondition toCount) {
        int counter = 0;
        for (Item it : itemList) {
            if (it.getState() == toCount)
                counter++;
        }
        return counter;
    }
}
