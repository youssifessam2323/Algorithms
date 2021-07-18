package com.joework;

import java.util.Arrays;
import java.util.List;

public class SelectionSort<T extends Number & Comparable<T>> implements Sort<T> {


    /**
     *  1. find the min element in the array
     *  2. swap it with the first element of the unsorted part
     *  3. repeat until you reach the end of the list
     * @param
     */
    @Override
    public void sort(T[] arr) {
        // 4 1 2 6 5 7
        for (int i = 0; i < arr.length; i++) {
                int minElementIndex = findMin(arr,i);
                printArray(arr);
                System.out.println();
                swap(arr,i,minElementIndex);
                printArray(arr);
                System.out.println();
        }
    }

    private void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr [j] = temp;
    }

    private int findMin(T[] arr, int index) {

        T min = arr[index];

        for (int i = index; i < arr.length; i++) {
            if(min.compareTo(arr[i]) > 0) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Double[] arr = {4.2,2.3,1.0,6.1,4.1,7.0,3.0};
        SelectionSort<Double> selectionSort = new SelectionSort<>();
        selectionSort.sort(arr);

        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));


    }

}
