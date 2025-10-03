import java.util.Scanner;

public class CounpundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompuneded;
        int years;
        double amount;

        System.out.println("Enter the Principal Amount : ");
        principal = scanner.nextInt();
        System.out.println("Enter the interesst rate in percentage % : ");
        rate = scanner.nextDouble();
        System.out.println("Enter the number of times principal is compounded : ");
        timesCompuneded = scanner.nextInt();
        System.out.println("enter the number of years : ");
        years = scanner.nextInt();
        System.out.println("enter the amount of money you want to calculate :");
        amount = scanner.nextInt();

        //logic for calculating the compounded interest

        scanner.close();
    }
}
