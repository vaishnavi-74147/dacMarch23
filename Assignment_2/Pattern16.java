
class Pattern16
{
public static void main(String args[])
	{
		
		for(int i = 5 ; i>=1; i--)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
		
		/*
		
		5
		5 4
		5 4 3
		5 4 3 2
		5 4 3 2 1
		*/
		
		//----------------------------------------------------------------------------------
		
		/*
		for(int i = 5 ; i>=1; i--)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
		*/
		
		/*
		
		5
		4 4
		3 3 3
		2 2 2 2
		1 1 1 1 1
		
		*/
	}
}