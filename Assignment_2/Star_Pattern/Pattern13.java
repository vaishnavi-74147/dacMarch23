

class Pattern9
{
	public static void main(String args[])
	{
		for(int i=1; i<4 ; i++)
		{
			// Space
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j= 4; j>=i ; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		//======================================
		

		for(int i=1 ; i<=5;i++)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			for(int k= 1; k<=i;k++)
			{
				System.out.print("*");// space not given.
			}
			System.out.println();
		}
	}
	
}

/*
     ****
	  ***
	   **
	    *
	   **
	  ***
	 ****
		 
		 
		 */