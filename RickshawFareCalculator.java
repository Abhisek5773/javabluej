import java.util.Scanner;

public class RickshawFareCalculator {

    
    private static final double BASE_FARE = 3.00;
    private static final double PER_KM_RATE = 1.50;
    private static final double MAX_FARE = 25.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rickshaw Fare Calculator ===");
        System.out.print("Enter distance travelled (in km): ");

       
        double distance;
        try {
            distance = Double.parseDouble(scanner.nextLine());
            if (distance < 0) {
                System.out.println("Distance cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return;
        }

        
        double fare = calculateFare(distance);

        
        System.out.println("\n===== Fare Summary =====");
        System.out.printf("Distance Travelled : %.2f km%n", distance);
        System.out.printf("Total Fare         : £%.2f%n", fare);
        System.out.println("=========================");
    }

    
    private static double calculateFare(double distance) {
        double fare = BASE_FARE + (PER_KM_RATE * distance);

        
        if (fare > MAX_FARE) {
            fare = MAX_FARE;
        }

        return fare;
    }
}

