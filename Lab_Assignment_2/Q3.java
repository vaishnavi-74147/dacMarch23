
/*Input: 24689
Output: Number of even digits: 4, Number of odd digits: 1*/

	import java.util.Scanner;
	class Q3
	{
		static int rem ;
		static int sum = 0;
		public void count(int n)
		{
			while(n!=0)
			{
				rem = n%10;
				Q3.sum = sum + rem;
				n/=10;
			}
		}
				
		
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			Q3 c = new Q3();
			c.count(n);
			System.out.println("Sum of the number is : " +Q3.sum);
			
			
		}
		
	}
		
	
	