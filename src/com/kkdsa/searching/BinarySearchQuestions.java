package com.kkdsa.searching;

public class BinarySearchQuestions {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println();
    }

    public static int findCeiling(int[] arr, int target){
        // ceiling is the smallest number which is greater than or equal to target
        int start = 0;
        int end = arr.length - 1;

        if(target >= arr[end]) return -1;

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
        return start;
    }
    public static int findFloor(int[] arr, int target){
        // floor is the greatest number which is smaller than or equal to target
        int start = 0;
        int end = arr.length - 1;

        if(target <= arr[start]) return -1;

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
        return end;
    }
}
