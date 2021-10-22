package com.joework.dp;


class FibUsingDP {
    

    int fibUsingRecursion(int n){
        
        if(n == 0 || n == 1)
            return n;
    
        return fibUsingRecursion(n - 1)  + fibUsingRecursion(n - 2);
    } 

    long fibUsingDP(int n) { 
        
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
    
        FibUsingDP f = new FibUsingDP()  ;

       System.out.println( f.fibUsingDP(50));
}
} 