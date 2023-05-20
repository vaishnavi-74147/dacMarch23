
/*Input: 24689
Output: Number of even digits: 4, Number of odd digits: 1*/

	import java.util.Scanner;
	class Q2
	{
		static int rem ;
		static int a = 0;
		static int b = 0;
		public void count(int n)
		{
			while(n!=0)
			{
				rem = n%10;
				
				if(rem%2 == 0)
				{
					Q2.a++;
				}
				else
				{
				Q2.b++;
				}
				
				n/=10;
			}
		}
				
		
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			Q2 c = new Q2();
			c.count(n);
			System.out.println("Even number count : " +Q2.a);
			System.out.println("Odd number  Count : " +Q2.b);
			
			
		}
		
	}
		
	
	