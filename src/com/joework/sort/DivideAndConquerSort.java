package com.joework.sort;

 interface DivideAndConquerSort<T extends Number & Comparable<T>> {
    T[] sort(T[] arr, int start, int end);
}
