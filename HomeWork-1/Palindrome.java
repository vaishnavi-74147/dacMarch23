
import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int  num ,rem;
		int  sum = 0;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		num  = sc.nextInt();
		temp = num;
		
		
		while(num>0)
		{
			rem = num%10;
			sum = (sum*10) + rem;
			num = num / 10;
		}
		
		if(temp==sum)
		System.out.println("Number is Palindrome");
		else
		System.out.println("Number is not Palindrome");	
		
		
			
		
	}
		 
}