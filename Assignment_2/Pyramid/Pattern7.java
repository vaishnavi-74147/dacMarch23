

class Pattern7
{
	public static void main(String args[])
	{
		
		for(int i = 1; i<=9; i++)
		{
			
			// space
			for(int j = 1 ;j<=i; j++ )
			{
				System.out.print(" ");   
			}


			for(int j=8; j>=i ; j--)
			{
				System.out.print(i +" ");    
				
			}
			
			System.out.println();
		}
	    
	}
	
}