package com.joework.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    private Sort<Integer> sort;

    @BeforeEach
    public void setup(){
        sort = new QuickSort();
    }

// this test fail
    @Test
    public void test_quicksort(){
        Integer []arr = {5,5,5,5,5,5};

        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], i + 1);
        }

    }

}