package com.kkdsa.basics;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFib(1));
    }
    public static int findFib(int n) {
//        this function will return the nth fibonacci number starting from 1
        int a = 0;
        int b = 1;
        int count = 1;
        int temp;
        // 0 1 1 2 3 5 8 13 21 34
        while (count < n){
            temp = a + b;
            a = b;
            b = temp;
            count++;
        }

        return b;
    }
}
