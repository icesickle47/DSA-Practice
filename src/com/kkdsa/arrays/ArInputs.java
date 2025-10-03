package com.kkdsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 123;
        arr[1] = 354;
        arr[2] = 123;
        arr[3] = 12;
        arr[4] = 23;

        int[] arr1 = new int[6];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }// this array will take input from externa input given by the user

        System.out.println(Arrays.toString(arr1));
    }

    public static void createStringArray(int size){
        String[] arr = new String[size];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = in.next();
        }
    }
}
