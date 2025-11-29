import java.util.Scanner;

/**
 * Write a description of class PositiveNegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegative
{ public static void main(String[] args){
  Scanner scanner= new Scanner(System.in);
  int num;
  System.out.print("Enter a num:");
  num=scanner.nextInt();
  if(num==0)
    System.out.printf("%d is 0/n",num);
    else if(num>0)
    
    System.out.printf("%d is positive\n",num);
    else
    System.out.printf("%d is Negative\n",num);
    
    
    
    
    
    
    

  

}
}