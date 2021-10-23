package com.joework.dp;


public class ZeroOneKnapsack {

    /**
     *  we use here a DP to solve the knapsap problem by making a table which is it's row is the number of item and
     *  it's columns is from 1 -> capacity and we compute the best case at each possible capacity so the algorithm is : 
     * 
     *  1) define an 2D array for storing the values.
     *  
     *  2) loop over the row which has items = 0 and assign it with zeros (  as at this case there is no items)
     *  
     *  3) for each row do the following:
     *      
     *       3.1) go for j = 1 -> capacity and do the following:
     *             
     *            3.1.1) if the weight of item i greater that the capacity
     *                   j ==> assign the t[i][j] the value from the prev row
     *          
     *           3.1.2) if the weight of item i is less that the capacity j 
     *                  ==>  assign t[i][j] to the max of either the value i + value of the prev row and the col of j - weight i
     *                       or assign it to the value of the prev row
     */

    public int maxItemsInKnapsack(int [] weights, int[] values, int noOfItems, int capacity ){

        int[][] t = new int[noOfItems+1][capacity+1];

        for (int i = 0; i <= capacity; i++) {
            t[0][i] = 0;
        }

        for (int i = 0; i < noOfItems; i++) {
            for (int j = 0; j <= capacity; j++) {
                if(weights[i] > j ){
                    t[i + 1][j] = t[i][j];
                }else { 
                    t[i + 1][j] = Math.max(values[i] + t[i][j - weights[i]], t[i + 1][j] = t[i][j]);  
                }
            }
        }

        return t[noOfItems][capacity];
    }


    public static void main(String[] args) {
    
        
        
        ZeroOneKnapsack z = new ZeroOneKnapsack();
        

       System.out.println( z.maxItemsInKnapsack(new int[]{2,3,5}, new int[]{3,4,6}, 3, 10));
    }
}
