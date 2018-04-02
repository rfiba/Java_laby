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
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = 1;
        System.out.println(MyArray.solution(array));

    }
}
