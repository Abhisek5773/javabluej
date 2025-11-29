import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your yearly income in Rs: ");
        double annualIncome = input.nextDouble();

        double totalTax = 0;
        String category;

        if (annualIncome <= 500_000) {
            category = "A";
        } else if (annualIncome <= 700_000) {
            category = "B";
        } else if (annualIncome <= 1_000_000) {
            category = "C";
        } else if (annualIncome <= 2_000_000) {
            category = "D";
        } else if (annualIncome <= 5_000_000) {
            category = "E";
        } else {
            category = "F";
        }

        switch (category) {
            case "A" -> totalTax = 0.01 * annualIncome;
            case "B" -> totalTax = 5_000 + 0.10 * (annualIncome - 500_000);
            case "C" -> totalTax = 15_000 + 0.20 * (annualIncome - 700_000);
            case "D" -> totalTax = 35_000 + 0.30 * (annualIncome - 1_000_000);
            case "E" -> totalTax = 335_000 + 0.36 * (annualIncome - 2_000_000);
            case "F" -> totalTax = 1_135_000 + 0.39 * (annualIncome - 5_000_000);
        }

        System.out.println("Calculated Income Tax: NPR " + totalTax);
    }
}