package com.company;

public class MyArray {
    public static int solution(int []a)
    {
        int result = 0;
        for (int i = 0; i < a.length;i++)
            result += a[i] * Math.pow(10,i);
        System.out.println(result);
        return result*17;
    }
}
