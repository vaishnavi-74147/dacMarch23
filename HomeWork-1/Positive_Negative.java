
import java.util.Scanner;
class Positive_Negative
{
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a>=0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
		
	}
}