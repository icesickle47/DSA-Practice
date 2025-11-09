package src.com.kkdsa.dsamath;

public class DSAMath {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " " + isprime(i));
        }
    }

    public static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        if(n % 2 == 0){ // since only even prime is 2
            return false;
        }

        // starting c at 2 since 1 will always divide c
        int c = 2;

        while(c * c < n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        return true;
    }
}
