
import java.util.Scanner;
class Lcm
{
	
	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a  = sc.nextInt();
		System.out.println("Enter Second number");
		b  = sc.nextInt();
		
		int L = (a>b )? a: b ;
		
		while(true)
		{
		if(L%a==0 && L%b==0)
		{
		System.out.println(L +" is the LCM of given numbers");
		break;
		}
		L++;
		
	    }
	}	
		
		
		
		
		
			
		
	
		 
}