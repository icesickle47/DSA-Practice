package src.com.kkdsa.sorting;

public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - i ; i++) {

        }
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
