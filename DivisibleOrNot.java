import java.util.Scanner;

/**
 * Write a description of class DivisibleOrNot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleOrNot
{ public static void main(String[] args){
  Scanner scanner= new Scanner(System.in);
  int num;
  System.out.print("Enter a num:");
  num=scanner.nextInt();
  if(num%3 ==0 && num%5 ==0)
   System.out.println(num+"is divisible by both 3 and 5.");
    
    else
        
        System.out.println(num+"is not divisible by both 3 and 5.");
        
    } 
}
    
    
    
      
      
    
    
    
    
     

