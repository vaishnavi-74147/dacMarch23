

import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		int fact = 1;
		
		
		for(i=1;i <= num;i++)
		{
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
	
}