

class Pattern6
{
    public static void main(String args[])
	{
		for(int i=1; i<=5 ; i++)
		{
			// Space
		    for(int j=1;j<=i;j++)
		    {
			  System.out.print(" ");
		    }
			
			for(int j=5;j>=i;j--)
			{
			  System.out.print("*");
			}
			
			for( int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
			
		}
		
	}
}
  /*                       *******
                            *****
							 ***
							  *