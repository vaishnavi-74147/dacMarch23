
import java.util.Scanner;
class Even_odd
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
	}
}