package com.kkdsa.advanced;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6,7,8,9,};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr){
        int max = 0;
        for (int num : arr) {
            if(max < num){
                max = num;
            }
        }
       return max;
    }

    static int findMaxInRange(int[] arr, int start, int end){
        return 0;
    }
}
