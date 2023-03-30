
import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//2
		int b = sc.nextInt();//3
		
		 a = a+b;//2+3=5
		 b = a-b;//5-3=2
		 a = a-b;//5-2=3
		
		System.out.println(a);//3
		System.out.println(b);//2
		
	}
}
		
		