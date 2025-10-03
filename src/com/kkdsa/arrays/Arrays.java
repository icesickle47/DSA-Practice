package com.kkdsa.arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] rnos1 = new String[5]; // array initialization and declaration at the same time
        int[] rnos2 = {1,2,3,4,5}; // another way to initialize and declare at the same time

        int[] ros; // here is the declaration of the array
        ros = new int[5]; // here we have initialized the array
        // this means that the array object got created in heap memory

        // heap objects are not continuous
        // the program gets assigned memory at runtime/compile time
        // array objects are in the heap area
        // this means that array objects are not in contiguous spaces in the heap

        for (int i = 0; i < rnos1.length; i++) {
            System.out.println(rnos1[i]);
        }// an initialized array has all zeros
        // a string array would have all null
    }

}
