import java.util.Random;

public class RndomClass {
    public static void main(String[] args) {
        Random random = new Random();

        double number = random.nextDouble(1, 20);
        int number1 = random.nextInt(1, 7);
        boolean bool = random.nextBoolean();

        System.out.println(number1);
        System.out.println(bool);
        System.out.println(number);

    }
}
