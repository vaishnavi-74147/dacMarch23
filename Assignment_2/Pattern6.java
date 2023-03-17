

class Pattern6
{
public static void main(String args[])
	{
		// 1.
		for(int i=1;i<=5;i++)
		{
			
			
			// 2. 
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			
			// 3.
			for(int k=1;k<=i;k++)
			{
			  System.out.print(k+" ");
			}
			System.out.println();
			
			
		}// end first for loop.
			
		
	}
}

      /*
	                 1
					1 2
				   1 2 3
				  1 2 3 4
				 1 2 3 4 5
				 
	*/
