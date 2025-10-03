package com.kkdsa.basics;

public class MaxNum {
    public int maxNum(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }
    public int maxNumMath(int a, int b, int c){
        return Math.max(c, Math.max(a, b));
    }
}
