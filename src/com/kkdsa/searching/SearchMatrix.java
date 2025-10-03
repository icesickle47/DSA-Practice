package com.kkdsa.searching;

public class SearchMatrix {
    public static void main(String[] args) {

    }
    public static int[] searchInMatrix(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) return new int[]{r,c};
            if(matrix[r][c] > target){
                c--; // reduce column if it is greater than target
            }
            else {
                r++;
            }
        }

        return new int[] {-1, -1};
    }
}
