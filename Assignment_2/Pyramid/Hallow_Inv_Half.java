

class Hallow_Inv_Half
{
	public static void main(String args[])
	{
		for(int i =1; i<=6; i++)
		{
			
			for(int j=1 ; j<=6-i+i ; j++)
			{
				if(j==1 || i==1 || j==6-i+1)
				{
                   System.out.print("*");
				}
					
				else
				{
					 System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	
	    
	}
	
}