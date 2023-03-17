

class Hallow_Inv_Triangle
{
	public static void main(String args[])
	{
		for(int i =1; i<=5; i++)
		{
			//Spaces == 4,3,2,1,0
			for(int j=1 ; j<=5-i ; j++)
			{
				System.out.print("  ");
			}
			
			//Start
			for(int k=1;k<=2*i-1;k++)
			{
				if(k==1 || k==2*i-1||i==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	
	    
	}
	
}