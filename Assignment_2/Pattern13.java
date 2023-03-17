

class Pattern13
{
	public static void main(String args[])
	{
		char alpha = 64;
		
		for(int i=1 ; i<=5;i++)
		{
			for(int j= 5; j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 1 ; j<=i;j++)
			{
				System.out.print((char)(alpha+i) +" ");
			}
			System.out.println();
		}
		
	}
}

/*


                      A
					 B B
					C C C
				   D D D D 
				  E E E E E
				  
				  
				  */