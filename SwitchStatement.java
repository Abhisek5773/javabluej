import java.util.Scanner;

/**
 * Write a description of class SwitchStatement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchStatement
{public static void main(String[]  args){
 
Scanner scanner= new Scanner(System.in);

 System.out.print("Enter The category of Product:'a','b','c','d','e'");
 char A= scanner.next().charAt(0);
 System.out.print("Enter the price of product");
 double mp= scanner.nextFloat();
 double sp;
 switch(A){
    case('a')->{
        
  sp=mp-(mp +60.0/100.0);
    System.out.print("Your price is :"+sp);
}

     case('b')->{
        
  sp=mp-(mp +60.0/100.0);
    System.out.print("Your price is :"+sp);
}
    
     case('c')->{
        
  sp=mp-(mp +60.0/100.0);
    System.out.print("Your price is :"+sp);
}
    
     case('d')->{
        
  sp=mp-(mp +60.0/100.0);
    System.out.print("Your price is :"+sp);
}
  default->System.out.println("Enter a valid choice");
  

} 
    
    
    
    
    }

}
