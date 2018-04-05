package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyArrayTest {

    @Test
    void solution_NullArray_ThrownException() {

        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            MyArray.solution(null);
        });
        assertEquals("Array is null", exception.getMessage());
    }

    @Test
    void solution_EmptyArray_ThrownException() {
        int []array = new int[3];
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyArray.solution(array);
        });
        assertEquals("The most significant digit is 0", exception.getMessage());
    }

    @Test
    void solution_ToBigArray_ThrownException() {
        int []array = new int[12];
        array[11] = 1;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyArray.solution(array);
        });
        assertEquals("There are too many digits for int", exception.getMessage());
    }

    @Test
    void solution_InvalidValues_ThrownException() {
        int []array = new int[2];
        array[0] = -1;
        array[1] = 1;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyArray.solution(array);
        });
        assertEquals("Value has to be inside <0,9>", exception.getMessage());
    }

    @Test
    void solution_ToBigResult_ThrownException() {
        int []array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = 9;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyArray.solution(array);
        });
        assertEquals("Result is to big for int", exception.getMessage());
    }

    @Test
    void solution_ToSmallResult_ThrownException() {
        int []array = new int[10];
        for (int i = 0; i < 9; i++)
            array[i] = 9;
        array[9] = -9;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyArray.solution(array);
        });
        assertEquals("Result is to small for int", exception.getMessage());
    }

    @Test
    void solution_TheBiggestPossibleValue_Result()
    {
        int []array = new int[9];
        array[0] = 7;
        array[1] = 6;
        array[2] = 5;
        array[3] = 2;
        array[4] = 2;
        array[5] = 3;
        array[6] = 6;
        array[7] = 2;
        array[8] = 1;
        assertEquals(2147483639,MyArray.solution(array));
    }

    @Test
    void solution_TheSmallestPossibleValue_Result()
    {
        int []array = new int[9];
        array[0] = 7;
        array[1] = 6;
        array[2] = 5;
        array[3] = 2;
        array[4] = 2;
        array[5] = 3;
        array[6] = 6;
        array[7] = 2;
        array[8] = -1;
        assertEquals(-2147483639,MyArray.solution(array));
    }

    @Test
    void solution_NormalValue_Result()
    {
        int []array = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = 1;
        assertEquals(2601,MyArray.solution(array));
    }

    @Test
    void solution_NegativeNormalValue_Result()
    {
        int []array = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = -1;
        assertEquals(-2601,MyArray.solution(array));
    }
}