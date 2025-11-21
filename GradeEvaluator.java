import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{ 
    public static void main(String[] args){
      
        
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Enter a new number");
        int marks= Scanner.nextInt();
        String isPass = (marks>=40)? "You Passed" : "You Failed";
        System.out.println(isPass);
        Scanner.close();
        
        
        
        
        
    
        
    
    }
}