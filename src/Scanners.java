import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name :");
        String name = scanner.nextLine();

        System.out.println("Please tell us your age :");
        int age = scanner.nextInt();

        System.out.println("Please tell us about your quarterly peroformance rating(out of 10):");
        double performanceAvg = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your performance average is :" + performanceAvg);

        // make sure that you close your scanner object after you are done using it
        scanner.close();
    }
}
