
import java.util.Scanner;
class Smallest_no
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		if(a<b&&a<c)
		{
		  System.out.println(a+" a is Smallest Number ");
		}
		else if(b<a&&b<c)
		{
		System.out.println(b+" b is Smallest Number ");
		}
		
		else
		{
			System.out.println(c+" c is Smallest Number  ");
		}	
		
	}
	
}