package com.joework;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        int[] ints = {6, 2, 1, 4, 3, 5};
        m.findDuplicate(ints);
    }

    public int findDuplicate(int[] nums) {
        quickSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        return 0;
    }


    private void quickSort(int[] arr) {
        quickSortArray(arr, 0, arr.length - 1);
    }

    private void quickSortArray(int[] arr, int l, int r) {
        if(r - l <= 0)
            return;

        int pivot = arr[r];

        int partition = partition(arr, l, r - 1, pivot);
        quickSortArray(arr, l, partition - 1);
        quickSortArray(arr, partition + 1, r);
    }

    private int partition(int[] arr, int l, int r, int pivot) {
        int i = l - 1;
        int j = l;
        while (j <= r) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
            j++;
        }
        swap(arr, i + 1, r + 1);

        return i + 1;
    }
    private void swap(int []arr , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

