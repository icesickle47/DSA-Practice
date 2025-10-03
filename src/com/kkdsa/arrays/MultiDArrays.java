package com.kkdsa.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrays {
    public static void main(String[] args) {
        int[][] intarr = new int[3][3];

        int[][] arr = {
                {1,2,3},
                {4,5,6, 69,69,69},
                {7,8,9,99,123}
        }; // basically an array of arrays

        populate2DArray(intarr);

        System.out.println(Arrays.toString(arr));
        print2DArray(arr);
        System.out.println();
        print2DArray(intarr);
    }

    /*for arrays which have already been declared with a size values
    * this will only work for 2d arrays which have integer as their primary data type*/
    public static void populate2DArray(int[][] arr){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    public static void print2DArray(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
