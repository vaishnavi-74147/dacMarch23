
import java.util.Scanner;
class Even_Series
{
	public static void main(String args[])
	{
		
		  int number;  
		  Scanner sc = new Scanner(System.in);
		  number = sc.nextInt();
             System.out.print("List of even numbers from 1 to "+number+": ");  
          for (int i=1; i<=number; i++)   
          {  
              
          if (i%2==0)   
             {  
                 System.out.print(i + " "); 
			 }				 
		  }
	}
}