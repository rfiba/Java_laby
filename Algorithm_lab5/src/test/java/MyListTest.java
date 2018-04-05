package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;


class MyListTest {

    @Test
    void solution_NullList_ThrownException() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            MyList.solution(null);
        });
        assertEquals("List is null", exception.getMessage());
    }

    @Test
    void solution_EmptyList_ThrownException() {
        List<Integer> list = new ArrayList<>();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyList.solution(list);
        });
        assertEquals("List is empty", exception.getMessage());
    }

    @Test
    void solution_ToBigList_ThrownException(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10e5; i++)
            list.add(0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MyList.solution(list);
        });
        assertEquals("List is to big", exception.getMessage());
    }

    @Test
    void solution_MinValue_Result(){
        List<Integer> list = new ArrayList<>();
        list.add((int)-10e6);
        assertEquals(1, MyList.solution(list));
    }

    @Test
    void solution_MaxValue_Result(){
        List<Integer> list = new ArrayList<>();
        list.add((int)10e6);
        assertEquals(1, MyList.solution(list));
    }

    @Test
    void solution_OnePositiveElementList_Result(){
        List<Integer> list = new ArrayList<>();
        list.add(342);
        assertEquals(1, MyList.solution(list));
    }

    @Test
    void solution_OneNegativeElementList_Result(){
        List<Integer> list = new ArrayList<>();
        list.add(-432);
        assertEquals(1, MyList.solution(list));
    }

    @Test
    void solution_PositiveElementsList_Result()
    {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(23);
        list.add(432);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(12412);
        list.add(6);
        list.add(32);
        assertEquals(7, MyList.solution(list));
    }

    @Test
    void solution_NegativeElementsList_Result()
    {
        List<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(-1);
        list.add(-23);
        list.add(-432);
        list.add(-3);
        list.add(-2);
        list.add(-5);
        list.add(-12412);
        list.add(-6);
        list.add(-32);
        assertEquals(1, MyList.solution(list));
    }

    @Test
    void solution_TenZeroAndRandomElementsList_Result()
    {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(23);
        list.add(432);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(12412);
        list.add(6);
        list.add(32);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        assertEquals(7, MyList.solution(list));
    }

    @Test
    void solution_From1to10e5List_Result()
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 100000; i++)
            list.add(i);
        assertEquals(100001, MyList.solution(list));
    }



}