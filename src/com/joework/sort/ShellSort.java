package com.joework.sort;

import java.util.Arrays;

/***
 this algorithms uses intervals to sort the far index so for example if 1 is in the end of the array and 10 at
 the begin of it so we make swaps for index that are far from each right place to make them nearest to them
 EXAMPLE:
 [10,7,3,1,5,8,4,6,9,2]
 so we begin with the interval with 1 and increment it with this formula h = h*3+1 until it reach the third or
 the half of the array size then we reduce the operation until it be a normal insertion sort
 and every iteration you will reduce the h be h = (h - 1)/3


 note: there
 */

public class ShellSort implements Sort<Integer> {

    public void sort(Integer []arr) {
        int outer, inner, temp;


        int h = 1;
            while (h <= arr.length / 3)
                h = h * 3 + 1;

        while (h > 0){

            for (outer = h; outer < arr.length; outer++) {

                temp = arr[outer];
                inner = outer;

                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
       }
    }

}
