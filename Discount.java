import java.util.Scanner;

/**
 * Write a description of class Discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Discount
{  public static void main(String[] args ){
Scanner scanner= new Scanner(System.in);

 System.out.print("Enter The category of Product:'a','b','c','d','e'");
 char A= scanner.next().charAt(0);
 System.out.print("Enter the price of product");
 double mp= scanner.nextFloat();
 double sp;
 if(A=='a')
 {
    sp=mp-(mp +60.0/100.0);
    System.out.print("Your price is :"+sp);
    
    
    }
    
    else if (A=='b'){
        sp=mp-(mp*40.0/100.0);
        
    System.out.print("Your price is :"+sp);
}
    
    else if (A=='c'){
        sp=mp-(mp*20.0/100.0);
        
    System.out.print("Your price is :"+sp);
    
    }
  else if (A=='d'){
        sp=mp-(mp*10.0/100.0);
        
    System.out.print("Your price is :"+sp);
}
else{System.out.println("Enter a valid category.");}



}

 
  
    
 
 
  

}
