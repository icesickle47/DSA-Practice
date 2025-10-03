package com.kkdsa.advanced;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5, 34, 6, 7};
        int[] arrodd =  {1, 2, 3, 4, 4, 45, 34, 6, 7};
        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 4);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
//            if(start == end) break; // this condition is only required when I'm putting the = condition in the loop

            swap(arr, start, end);

            start++;
            end--;
        }
    }
}
