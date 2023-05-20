
/*Input: 12345
Output: Number of digits: 5*/

	import java.util.Scanner;
	class Q1
	{
		static int a = 0;
		public void count(int n)
		{
			while(n!=0)
			{
				n/=10;
				Q1.a++;
			}
		}
				
		
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			Q1 c = new Q1();
			c.count(n);
			System.out.println("Count : " +Q1.a);
			
			
		}
		
	}
		
	
	