package com.joework.sort;

import java.util.Arrays;

/**
 * quick sort is one of the most popular sorting algorithms
 *
 * Quick sort is typically faster than merge sort when the data is stored in
 * memory. However, when the data set is huge and is stored on external devices such as a hard drive,
 * merge sort is the clear winner in terms of speed. It minimizes the expensive reads of the external drive and also lends
 * itself well to parallel computing.
 *
 * also, one of the advantage of quick sort is that it does not require addition memory, so it is categories as in-place algorithm
 *
 *
 * HOW IT WORKS:
 *  first we find a pivot in the array to divide it into parts that follow this => left_subarray < pivot < right_subarray
 *  after we find the pivot we're sorting the left sub array and the right sub array recursively
 *
 *  FIND PIVOT: there is multiple way for defining pivot the one we will use is by taking the most right element as a pivot
 */

public class QuickSort implements  Sort<Integer> {
    @Override
    public void sort(Integer[] arr) {
        quickSort(arr,0,arr.length - 1);
    }

    private void quickSort(Integer[] arr, int l, int r) {
        if(l >= r){
            return;
        }
        int pivotIndex = partition(arr,l,r);

        quickSort(arr,l,pivotIndex - 1);
        quickSort(arr,pivotIndex + 1, r);

    }

    /**
     *  4 [1,2,3,5,6,7,3,]
     *  i = -1, j = 0;
     *  if( arr[j] < pivot)
     *      incr i  and swap it with arr[j]
     *  swap the pivot in the position i + 1    
     */

    private int partition(Integer[] arr, int l, int r) {
        int pivot = arr[r];

        int i = -1;

        for (int j = 0; j < arr.length - 1; j++) {
            if(arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,r);
        return i + 1 ;
    }

    private void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();

        Integer [] arr = {6,5,1,2,3,4};
        sort.quickSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
