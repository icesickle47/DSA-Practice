public class Arithmatic {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;

        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;

        //ORDER OF OPERATIONS [P-E-M-D-A-S]

        x = x + y - x*y / x-y;
        System.out.println(x);
    }
}
