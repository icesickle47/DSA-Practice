package src.com.kkdsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,4,5,3};

        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            int j = i + 1;

            while(j > 0) {
                if(arr[j] > arr[j - 1]) break;
                else {
                    swap(arr, j, j -1 );
                }
                j--;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
