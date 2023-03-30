
import java.util.Scanner;
//import java.lang.io;
class Armstrong
{

	public static void main(String args[])
	{		
		//inputs
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rem;
		int sum = 0;
		
		while(num != 0)
		{
			rem = num%10;
			sum+=Math.pow(rem,3);
			num=num/10;
		}
		
		if (temp == sum )
			System.out.println("Armstrong number");
		else
			System.out.println(" Not Armstrong number");
			
		
	
	}
	
}