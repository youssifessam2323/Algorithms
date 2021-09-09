package com.joework.favorite;

import java.util.Arrays;

// wrong
public class StringPermutationByRecursion {



    public static void permuteString(String []arr, int start, int end){
        if ((end - start) == 1) {
            rotate(arr, start,end);
            System.out.println(Arrays.toString(arr));
        }

        for (int i = start; i < end + 1; i++) {
            permuteString(arr, start + 1,end);
            rotate(arr,start,end);
            System.out.println(Arrays.toString(arr));
        }

    }

    private static void rotate(String[] arr,int start, int end) {
        int position = arr.length - (end - start);
        String temp = arr[start];
        for (int i = start + 1; i < end + 1; i++) {
            arr[i - 1] = arr[i];
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"A","B","C"};

        permuteString(arr,0, arr.length - 1);
    }

}
