
import java.util.Scanner;
class Prime_Not
{
	public static void main(String args[])
	{
		
		int temp =0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =2; i<=n-1;i++)
		{
			if(n%i ==0)
			{
				temp = temp + 1;
			}
		}
		
		if(temp==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Is not a Prime number");
		}
	}
}