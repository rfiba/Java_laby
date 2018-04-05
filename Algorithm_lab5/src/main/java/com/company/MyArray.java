package com.company;

public class MyArray {
    public static int solution(int []a)
    {
        if(a == null)
            throw new NullPointerException("Array is null");
        if(a[a.length-1] == 0)
            throw new IllegalArgumentException("The most significant digit is 0");
        if(a.length > 10)
            throw new IllegalArgumentException("There are too many digits for int");

        long tmpResult = 0;

        if(a[a.length-1] > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 9 || a[i] < 0)
                    throw new IllegalArgumentException("Value has to be inside <0,9>");
                tmpResult += a[i] * Math.pow(10, i);
            }

            tmpResult *= 17;

            if (tmpResult > Integer.MAX_VALUE)
                throw new IllegalArgumentException("Result is to big for int");
        }
        else
        {
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > 9 || a[i] < 0)
                    throw new IllegalArgumentException("Value has to be inside <0,9>");
                tmpResult -= a[i] * Math.pow(10, i);

            }
            tmpResult += a[a.length-1] * Math.pow(10, a.length-1);

            tmpResult *= 17;

            if (tmpResult < Integer.MIN_VALUE)
                throw new IllegalArgumentException("Result is to small for int");
        }
        int result = (int)tmpResult;

        return result;
    }
}
