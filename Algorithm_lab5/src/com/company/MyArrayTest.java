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
}