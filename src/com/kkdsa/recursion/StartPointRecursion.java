package src.com.kkdsa.recursion;

public class StartPointRecursion {
    public static void main(String[] args) {
        printNTimes("what is this", 5);
        printRange(1,5);
        System.out.println(fib(1));
        System.out.println(fib(6));
    }

    //first recursive function called here
    public static void printNTimes(String str, int times){
        if(times == 0) return;
        printNTimes(str, times - 1);
        System.out.println(str);
    }

    public static void printRange(int start, int end){
        if(start == end) {
            System.out.println(end);
            return;
        };
        System.out.println(start);
        printRange(start + 1, end);
    }

    public static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }


}
