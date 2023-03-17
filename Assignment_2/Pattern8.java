

class Pattern8
{
public static void main(String args[])
	{
		for(int i=1 ; i<=5;i++)
		{
			for(int j= 5; j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 5 -i+1 ; j<=5;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}
}

                 /*
				 
				 5
				4 5
			   3 4 5
			  2 3 4 5
			 1 2 3 4 5
			 
			 */

