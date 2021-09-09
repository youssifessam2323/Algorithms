package com.joework.sort;

public interface Sort<T extends Number & Comparable<T>> {
    int x = 10 ;
    void sort(T[] arr);
    public interface Inner {
        void inner();
    }

}
