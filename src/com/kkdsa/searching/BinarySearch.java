package com.kkdsa.searching;

public class BinarySearch {
    /*
    * 1- the best use case for Binary Search is when you are using it on sorted arrays
    * 2- use modified versions of Binary Search to go through sorted data
    * 3- we are going to be using different ways to binary search in here
    *
    * ALGORITHM
    * - find the middle element
    * - compare the target element to the left and right limit of the array
    * - switch to the side where you are doing binary search,
    * - serach again until item found/not found(return -1)
    * */
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 22, 37, 45, 59, 68, 74, 89};
        int target = 59;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(arr, target, 0, arr.length -1));
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)  / 2 ;

            if(arr[mid] == target) return mid;
            if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){if (start > end) return -1;   // base case

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end); // ✅ return added
        } else {
            return binarySearch(arr, target, start, mid - 1); // ✅ return added
        }
    }

    /*
    * this variant of binary search can handle both ascending and descending sorted arrays
    * thus it will work with both areas*/
    public static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)  / 2 ;

            if(arr[mid] == target) return mid;
            if(isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
