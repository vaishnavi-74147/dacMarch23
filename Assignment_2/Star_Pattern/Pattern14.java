

class Pattern14
{
    public static void main(String args[])
	{
		for(int i = 1; i<5; i++) // remove extra row remove =
		{
			
			// space
			for(int j = 0 ;j<=i; j++ )
			{
				System.out.print(" ");   
			}


			for(int j=5; j>=i ; j--)
			{
				System.out.print("* ");    
				
			}
			
			System.out.println();
		}
		
		for(int i = 1; i<=5; i++)
		{
			
			// space
			for(int j = 6 ;j>=i; j-- )
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


/*   
  
	 * * * * *
	  * * * *
	   * * *
	    * *
		 *
		* *
	   * * *
	  * * * *
	 * * * * *
	
						  
						  
						  */