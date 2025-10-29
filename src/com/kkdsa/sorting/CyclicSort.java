package src.com.kkdsa.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,4,5,3,7,8,6};

        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == i + 1){
                i++;
            }
            else{
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
