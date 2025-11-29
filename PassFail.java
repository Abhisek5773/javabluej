import java.util.Scanner;

/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail
{ 
 public static void main(String[] args){
   Scanner scanner = new Scanner (System.in);
   double marks;
   System.out.println("Enter your marks:");
   marks= scanner.nextDouble();
   String ispass =(marks>=35)? "You Passed":"You Failed";
   System.out.println(ispass);
   
    
    
    
    }
}