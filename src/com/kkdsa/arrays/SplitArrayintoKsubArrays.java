package com.kkdsa.arrays;

public class SplitArrayintoKsubArrays {
    public static void main(String[] args) {

    }

    public static int maxSum(int[] nums, int m){
        int start = 0;
        int end = 0;

        //here we are finding the maximum range for sum of individual subarrays that can be made for this question
        for(int num : nums){
            start = Math.max(start, num);
            end += num;
        }

        while(start < end){
            int mid = start + (end - start) / 2; // guessing to minimise the max sum of subarray
            /*this mid is basically
            * telling us what the maximum sum can be for the subarray
            * which means we can add up all the elements to the point till it reaches this sum
            */

            int sum = 0;// this is the sum for each subarray
            int pieces = 1; // this is the count of subarrays we have made so far
            // value of pieces is 1 as we will always have a minimum of 1 array
            for(int num : nums){
                if(sum + num > mid){
                    sum = num; // here we will consider the last element for the next sum
                    pieces++; // the current subarray sum has reached its limit;
                }
                else{
                    sum += num; // else we add the element in the sum as that is within the limit of the sum of the subarray
                }
            }

            if(pieces > m){ // means that we divided into too many subarrays
                start = mid + 1;
            }
            else {
                end = mid - 1; // meaning that we didn't create enough subarrays
            }
        }

        return end;
    }
}
