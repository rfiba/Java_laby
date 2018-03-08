package com.company;

public class Item implements java.lang.Comparable<Item>{
    private String name;
    private ItemCondition state;
    private double weight;
    private int amount;

    Item(String nameToAdd, ItemCondition stateToAdd, double weightToAdd, int amountToAdd) {
        if (weightToAdd < 0 || amountToAdd < 0)
            throw new IllegalArgumentException("Argument < 0");

        name = nameToAdd;
        state = stateToAdd;
        weight = weightToAdd;
        amount = amountToAdd;
    }

    void print() {
        System.out.format("Name: %s, weight: %f, amount: %d " + state, name, weight, amount);
    }

    double getWeight() {
        return weight;
    }
    void increaseWeight(double weightToAdd) {
        weight += weightToAdd;
    }

    public int getAmount() {
        return amount;
    }

    void increase() {
        amount++;
    }

    void decrease() {
        amount--;
    }

    ItemCondition getState() {
        return state;
    }

    @Override
    public int compareTo(Item o) {
            return name.compareTo(o.name);
    }
}
