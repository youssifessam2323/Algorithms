package com.joework;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[]{1,3,2};

        System.out.println(isMonotonic(arr));

    }

    public static boolean isMonotonic(int[] nums) {
        if(isSorted(nums) || isReversedSorted(nums)){
            return true;
        }
        return false;
    }

    private static boolean isSorted(int []arr){

        for(int i = 0; i <= arr.length - 2; i++) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }


    private static boolean isReversedSorted(int []arr){

        for(int i = arr.length - 1; i > 0 ; i--) {
            if(arr[i] > arr[i - 1]){
                return false;
            }
        }
        return true;
    }

}


