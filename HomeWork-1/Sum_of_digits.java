
import java.util.Scanner;
class Sum_of_digits
{
	public static void main(String args[])
	{
		int  num ,digits;
		int  sum = 0;
		Scanner sc = new Scanner(System.in);
		num  = sc.nextInt();
		
		
		while(num>0)
		{
			digits = num%10;
			sum = sum+digits;
			num = num / 10;
		}
		System.out.println("Sum of digits ="+sum);
		
		
			
		
	}
		 
}