
import java.util.Scanner;
class Gcd
{
	
	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a  = sc.nextInt();
		System.out.println("Enter Second number");
		b  = sc.nextInt();
		
		
		
		 while(a!=b)
		 {
		 if(a>b)
		 a = a-b;
		 else
		 b = b-a;
		 }
		System.out.println( "Gcd of a and b is " +b);

	}
  }	
		 
