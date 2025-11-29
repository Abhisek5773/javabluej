import java.util.Scanner;

public class Movie
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Aadim Cinema. (Press Enter to Continue)");
        scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the movie language (N/H/E): ");
        String language = scanner.next().toUpperCase();

        System.out.print("Do you have a student ID (Y/N): ");
        String Id = scanner.next().toUpperCase();

        System.out.print("Is it a festival Today (Y/N): ");
        String fest = scanner.next().toUpperCase();

        double price = 0;

        if(age < 12)
        {
            price = 150;
        }
        else if(age > 12 && age < 64)
        {
            price = 250;
        }
        else if(age > 63)
        {
            price = 200;
        }
        else
        {
            System.out.print("Since you didn't enter a valid age your price is Rs.300.");
            price = 300;
  
     }
    }
}     