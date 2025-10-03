package com.kkdsa.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] multiDarr = {
                {10, 2, 3, 54, 45, 234},
                {4, 465, 66},
                {7, 8, 9, 23, 1}
        };

//        System.out.println(linearSearch(arr,3, 4,8));
//        System.out.println(linearSearch(arr,20, 1,8));
//        System.out.println(linearSearch(arr,20, 1,8));
        System.out.println(findMin(multiDarr));
    }

    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMin(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

}
