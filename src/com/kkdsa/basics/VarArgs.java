package com.kkdsa.basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,2,34,56,3);
    }

    static void multiple(int a, int b, String ...str){

    }

    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
}
