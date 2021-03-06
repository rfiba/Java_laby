package com.company;

import java.util.*;

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
        itemList = new LinkedList<>();
    }

    void addProduct(Item toAdd) {
        if (currentWeight + (toAdd.getWeight() * toAdd.getAmount()) >= capacity)
            throw new IllegalArgumentException("Cannot add. Lack of capacity");

        int it = itemList.indexOf(toAdd);

        if (it == -1) {
            itemList.add(toAdd);
        } else {
            itemList.get(it).increaseWeight(toAdd.getWeight()*toAdd.getAmount());
            itemList.get(it).increase();
        }
    }

    Item getProduct(Item toGet) {
        int it = itemList.indexOf(toGet);
        if (it == -1)
            throw new IllegalArgumentException("Cannot get. Item unfound");

        if (itemList.get(it).getAmount() == 1)
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
        sortByName();
        Item a = new Item(toFind, ItemCondition.NEW, 0 ,0);
        return itemList.get(java.util.Collections.binarySearch(itemList, a, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        }));
    }

    List<Item> searchPartial(String toFind) {
        List<Item> temp = new LinkedList<Item>();
        for (Item it : itemList) {
            if (it.getName().indexOf(toFind) == 0)
                temp.add(it);
        }
        return temp;
    }

    List<Item> sortByName() {
        List<Item> tmp = new LinkedList<>(itemList);
        tmp.sort(Item::compareTo);
        return tmp;
    }

    List<Item> sortByAmount() {
        List<Item> tmp = new LinkedList<>(itemList);
        tmp.sort(new Comparator<Item>() {
            @Override
            public  int compare(Item o1, Item o2) {
                return -Integer.compare(o1.getAmount(), o2.getAmount());
            }
        });
        return tmp;
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

    double getFilling()
    {
        double filling = 0;
        for (Item it : itemList) {
            filling += it.getAmount() * it.getWeight();
        }
        return filling/capacity;
    }
}
