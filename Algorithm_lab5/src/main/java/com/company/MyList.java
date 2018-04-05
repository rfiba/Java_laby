package com.company;

import java.util.List;

public class MyList {
    static public int solution(List<Integer> a) {
        if(a == null)
            throw new NullPointerException("List is null");

        if(a.size() == 0)
            throw new IllegalArgumentException("List is empty");

        if(a.size() > 10e5)
            throw new IllegalArgumentException("List is to big");

        a.sort((o1, o2) -> {
            return Integer.compare(o1, o2);
        });

        if(a.get(a.size()-1) < 0)
            return 1;

        int earlier = 0;
        for (int it : a) {
            if(it > 0 && it - earlier > 1)
                return earlier+1;
            earlier = it;
        }

        return a.get(a.size()-1) + 1;
    }
}
