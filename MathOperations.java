
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{     
    public static void main(String[] args){
      int a,b,c;
      a=2;
      b=3;
      c=a+b;
      System.out.println(c);
      a=a++;
      System.out.println(a);
      b=b++;
      System.out.println(b);
      a=2;
      b=a;
      System.out.println(b);
      System.out.println(a>b);
      System.out.println(a<b);
      System.out.println(a==b);
      boolean t= true ,f=false;
      System.out.println(t&&f);
      System.out.println(t||f);
      System.out.println(!t);
      String result=(a>b) ?"is greater":"b is greater";
      System.out.println(result);
      
      

    

      
    
    
    }
    
    
    
}