package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(6);
        a.add(4);
        a.add(1);
        a.add(2);
        System.out.println(MyList.solution(a));
    }
}
