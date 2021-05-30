package com.synechron.demo;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    //nitin


    //0,1,1,2,3
}
