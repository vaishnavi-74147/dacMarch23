

class Full_Inverted
{
	public static void main(String args[])
	{
		for(int i = 1; i<=6; i++)
		{
			
			// Space:
			for(int j = 1 ;j<=i ; j++ )
			{
				System.out.print(" ");   
			}
			
			
			
			
			for(int j = 6; j>=i ; j--)
			{
				System.out.print("* ");    
				
			}
			System.out.println();
	    }
	}
	
}