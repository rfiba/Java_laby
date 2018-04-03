package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
}