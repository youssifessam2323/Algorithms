package com.joework.sort;

public class BubbleSort<T extends  Number & Comparable<T>> implements Sort<T>{
//[3,2,4,1,5]
    @Override
    public void sort(T[] arr) {
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0){
                    var temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
