
class Pattern10
{
public static void main(String args[])
	{
	
		int alpha =64;
		
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 5-i; j<=5;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			
			
			
			System.out.println();
		}	
		
		
	}
	
}             /*

					E
				   D E
				  C D E
				 B C D E
				A B C D E
				
				*/