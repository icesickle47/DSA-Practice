package src.com.kkdsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {34, 52, -32, 1, 4, 5, 2, 3};

        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1; // last index of the array
            int max = findMaxIndex(arr, 0, last);
            swapInArray(last, max, arr);
        }
    }

    public static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = 0; i <= end ; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void swapInArray(int first, int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
