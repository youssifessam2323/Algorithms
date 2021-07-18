package com.joework;

public interface DivideAndConquerSort<T extends Number & Comparable<T>> {
    void sort(T[] arr, int start, int end);
}
