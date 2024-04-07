import java.util.Scanner;

public class tienvay {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        tien = input.nextDouble();
        System.out.println("Enter number of months");
        thang = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < thang; i++) {
        totalInterest += tien * (interestRate / 100) / 12 * thang;
    }
        System.out.println("Total of interest: " + totalInterest);
}
}