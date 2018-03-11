package com.company;

import java.util.*;

public class FulfillmentCenterContainer {
    private Map<String, FulfillmentCenter> map;

    FulfillmentCenterContainer() {
        map = new HashMap<String, FulfillmentCenter>();
    }

    void addCenter(String centerName, double centerCapacity)
    {
        FulfillmentCenter centerToAdd = new FulfillmentCenter(centerName, centerCapacity);
        map.put(centerName, centerToAdd);
    }

    void removeCenter(String centerName)
    {
        map.remove(centerName);
    }

    List<FulfillmentCenter> findEmpty()
    {
        List<FulfillmentCenter> listOfCenters = new LinkedList<FulfillmentCenter>();
        Set<Map.Entry<String,FulfillmentCenter>> entrySet = map.entrySet();
        for (Map.Entry<String,FulfillmentCenter> it: entrySet) {
            if (it.getValue().getFilling() == 0)
                listOfCenters.add(it.getValue());
        }
        return listOfCenters;
    }

    void summary() {
        Set<Map.Entry<String,FulfillmentCenter>> entrySet = map.entrySet();
        for (Map.Entry<String,FulfillmentCenter> it: entrySet) {
            System.out.print("Name: " + it.getKey());
            System.out.println(" " + it.getValue().getFilling());
        }
    }
}
