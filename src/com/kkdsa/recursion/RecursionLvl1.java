package src.com.kkdsa.recursion;

public class RecursionLvl1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    // function to pring all the numbers from n till this number
    public static void printN(int n){
        if(n == 0) return;
        printN(n - 1);
        System.out.println(n);
    }

    public static void printValley(int n){
        if(n == 0) return;

        System.out.println(n);
        printValley(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
