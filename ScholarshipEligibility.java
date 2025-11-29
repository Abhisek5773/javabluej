import java.util.Scanner;

public class ScholarshipEligibility
{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your gpa: ");
double GPA = scanner.nextDouble();
System.out.println("Enter your Attendance Percentage: ");
double Attendance = scanner.nextDouble();
System.out.print("Enter your Attirude Score: ");
double Attitude = scanner.nextDouble();
if(GPA >=3.2)
{
if(Attendance > 80)
{
if(Attitude > 5)
{
System.out.println("Eligible for Scholarship");
}
else System.out.println("You are not eligible for scholarship");
}
else System.out.println("You are not eligible for scholarship");
}
else {System.out.println("You are not eligible for scholarship");
}
}
}