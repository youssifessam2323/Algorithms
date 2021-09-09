package com.joework.sort;

import java.util.Arrays;

public class MergeSort<T extends Number & Comparable<T>> implements DivideAndConquerSort<T> {


    /**
     *  in this algorithms we use recursion to solve the sorting problem
     *  be using the divide and conquer approach to tackle this problem
     *  
     *  first we divide the input into two parts and we make this operation
     *  recursively until we reach the base case that when the input is two numbers so we 
     *  can sorting them without any problems
     * 
     * EXAMPLE => Input => [3,1,6,2]
     * ALG===> 
     * we will divide this list into [3,1] and [6,2]
     * then we sorting the first list be check the greater number and put it first, and the same for
     * the second list
     * after that we [1,3], [2,6]
     * we make a pointer in the first element of each sub list and make the comparison
     * so in our example we compare 1 and 2 so as 1 smaller that 2 we don't swap them and we will
     * move the pointer of the first list and again compare 3 and 2 and as 2 less that 3 we will swap these
     * two numbers and move the pointer from the 2 in the second list to the 6 and so on 
     * 
     * the running time for merge sort is at most => 6n * log2n + 6n operations
     * 
     * @param arr
     * @param start
     * @param end
     */
    @Override
    public T[] sort(T[] arr, int start, int end) {
    
        if((end - start) == 1 ) {
            if(arr[start].compareTo(arr[end]) > 0){
                swap(arr, start, end);
            }
            return Arrays.copyOfRange(arr,start,end);
        }


        int lArrayEnd = (arr.length / 2) - 1;
        int rArrayStart = (arr.length /2 );

        var leftArray = sort(arr, start, lArrayEnd);
        var rightArray= sort(arr, rArrayStart, end);

        merge(leftArray, rightArray);
        return null;
    }

    private void merge(T[] leftArray, T[] rightArray) {

    }

    private void swap(T[] arr, int start, int end) {
        T temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
