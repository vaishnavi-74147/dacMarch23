

class Pattern3
{
	public static void main(String args[])
	{
		
		for(int i = 1; i<=9; i++) // to remove one line remove(=) sign from i<=4
		{
			
			// space
			for(int j = 8 ;j>=i; j-- )
			{
				System.out.print(" ");   
			}


			for(int j=1; j<=i ; j++)
			{
				System.out.print("* ");    
				
			}
			
		
			
			
			System.out.println();
		}
	    
	}
	
}