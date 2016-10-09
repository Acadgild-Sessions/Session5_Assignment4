import java.util.*;

public class NumberFormatExcep
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
      String str="";
      System.out.print("Enter Number in Integer form (eg: 10) : " ); 
      str=sc.nextLine();
      int x = Integer.parseInt(str);
      System.out.println("Entered Number is : "+x);    
   
      try
      {
    	  System.out.print("\nEnter Number in String form to get NumberFormatException(eg: ten) : " ); 
          str=sc.nextLine();
          x = Integer.parseInt(str);
          System.out.println("Entered Number is : "+x);
        
      }
      catch(NumberFormatException e)
      {
        System.err.println("Unable to format. " + e);
      }
   }
 }
    