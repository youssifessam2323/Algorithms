package com.joework;

import java.util.Scanner;

public class KaratsubaMultiplicationAlg {


    public long getMultiplicationResult(long x, long y) {

         int lenX = getLength(x);
         int lenY = getLength(y);

         int n = Math.max(lenX, lenY);



         n = (n / 2) + (n % 2);

         long m = (long) Math.pow(10,n);

         long a = x / m ;
         long b = x - (a * m);
         long c = y / m ;
         long d = y - (a * m);




        return 0;
     }


     private int getLength(long num ) {
         // x = 1234
         int count = 0 ;
         while(num > 0){
            count ++ ;
             num /= 10;
         }

         return count;
     }


    public static void main(String[] args) {
//        System.out.println( getLength(1));
    }
}
