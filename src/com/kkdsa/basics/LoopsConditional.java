package com.kkdsa.basics;

import java.util.Scanner;

public class LoopsConditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        int bonus = bonusCalc(salary);



    }

    public static int bonusCalc(int sal){
        int bonus;
        if (sal > 12000){
            bonus = 5000;
        }
        else {
            bonus = 6000;
        }
        return bonus;
    }
}
