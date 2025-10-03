package com.kkdsa.searching;

import java.util.Arrays;
import java.util.Random;

public class SearchInfiniteArray {
    // here the premise is to search in a sorted array of unkown length
    // which means we cannot use the array.length function to find the length of the array
    // which means we cannot find start and end

    /*APPROACH
    * find the range for start and end, increase it exponentially
    * binary search that range to find the target element*/

    public static void main(String[] args) {
        int[] longArray = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        };
        int target = 13;
        int[] range = findRange(longArray, target);

        System.out.println(Arrays.toString(range));
        System.out.println(binarySearch(longArray, target, range[0], range[1]));
    }

    public static int[] findRange(int[] arr, int target){
        int start = 0;
        int end = start + 1;
        if(arr[end] > target){
            return new int[]{start, end};
        }else {
            while(arr[end] < target){
                int newStart = end + 1;
                end = newStart + 2 * (end - start);
            }
        }

        return new int[]{start, end};
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1; // element not found in given range
    }
}
