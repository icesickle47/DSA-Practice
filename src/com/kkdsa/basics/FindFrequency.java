package com.kkdsa.basics;

public class FindFrequency {
    public static void main(String[] args) {
        int n = 334453223;
        System.out.println(reverseNum(12345));

    }
    public static int findFreq(int n, int num){
        int count = 0;
        while(n != 0){
            int lastInt = n % 10;
            if (lastInt == num){
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static int reverseNum(int num){
        int rev = 0;
        while (num > 0) {
            int lastInt = num % 10;
            rev = rev * 10 + lastInt;
            num = num / 10;
        }
        return rev;
    }
}
