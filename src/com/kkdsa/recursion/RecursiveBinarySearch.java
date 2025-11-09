package src.com.kkdsa.recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int ans1 = binarySearch(nums, 0, nums.length - 1, 9);
        int ans2 = binarySearch(nums, 0, nums.length - 1, 0);
        int ans3 = binarySearch(nums, 0, nums.length - 1, 8);
        int ans4 = binarySearch(nums, 0, nums.length - 1, 58);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }

    static int binarySearch(int[] arr, int start, int end, int target){
//        int newMid = end - (start + end) / 2; // this is wrong as it calculates the half of length of the interval
        int mid = start + (end - start) / 2;
//        int newMid3 = end - (end - start) / 2; //same equivalent way to find for mid

        //base conditions
        if(arr[mid] == target) {
            return mid;
        }
        if(start >= end) {
            return -1;
        }

        if(arr[mid] > target){
            return binarySearch(arr, start, mid - 1, target);
        }
        else{
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
