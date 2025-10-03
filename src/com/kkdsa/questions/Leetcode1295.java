package com.kkdsa.questions;

public class Leetcode1295 {
    // find numbers with even number of digits
    // basically output how many numbers contain an even number of digits in the array
    public static void main(String[] args) {
        int[] numbers = {
                1, 23, 456, 7890, 12345, 678901, 42, 9000, 333, 777,
                15, 2222, 99999, 1000000, 314, 2718, 16180, 8080, 123, 4567,
                89, 101112, 131415, 161718, 1920, 212223, 242526, 2728, 293031, 3233,
                3435, 3637, 3839, 4041, 4243, 4445, 4647, 4849, 5051, 5253,
                5455, 5657, 5859, 6061, 6263, 6465, 6667, 6869, 7071, 7273,
                7475, 7677, 7879, 8081, 8283, 8485, 8687, 8889, 9091, 9293,
                9495, 9697, 9899, 100101, 102103, 104105, 106107, 108109, 110111, 112113,
                114115, 116117, 118119, 120121, 122123, 124125, 126127, 128129, 130131, 132133,
                134135, 136137, 138139, 140141, 142143, 144145, 146147, 148149, 150151, 152153,
                154155, 156157, 158159, 160161, 162163, 164165, 166167, 168169, 170171, 172173
        };

        int[] arr1 = {12, 345, 2, 6, 7896};   // Even digits: 12, 7896 → Count = 2
        int[] arr2 = {555, 901, 482, 1771};   // Even digits: 1771 → Count = 1
        int[] arr3 = {7, 44, 1234, 56, 890};  // Even digits: 44, 1234, 56, 890 → Count = 4
        int[] arr4 = {1, 22, 333, 4444, 55555}; // Even digits: 22, 4444 → Count = 2
        int[] arr5 = {10, 100, 1000, 10000};  // Even digits: 10, 1000 → Count = 2

        System.out.println(findNumbers(arr1));
        System.out.println(findNumbers(arr2));
        System.out.println(findNumbers(arr3));
        System.out.println(findNumbers(arr4));
        System.out.println(findNumbers(arr5));
        System.out.println(findNumbers(numbers));


    }

    public static int findNumbers(int[] arr){
        int ans = 0;

        for(int num : arr) {
            if(hasEvenDigits(num)) ans++;
        }

        return ans;
    }

    public static boolean hasEvenDigits(int num){
        int count = findNumberOfDigitsLog(num);
        return count % 2 == 0;
    }

    public static int findNumberOfDigits(int num){
        int numberOfDigits = 0;
        while(num > 0) {
            num = num / 10;
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    public static int findNumberOfDigitsLog(int num){
        if (num < 0){
            num = num * -1;
        }

        int numberOfDigits = 0;
        numberOfDigits = (int)Math.log10(num) + 1;

        return numberOfDigits;
    }

}
