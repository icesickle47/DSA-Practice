package com.kkdsa.questions;

public class Questions {
    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if (n % c == 0) return false;
            c++;
        }
        return c * c > n;
    }
//    print all the three digit armstrong numbers
//    an armstrong number is one which has individual sum of cubes of each digit equal to the number itself
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
}
