/*Example Input: "He#llo $Wo%rld1!"
Example Output: "HelloWorld1"*/

	import java.util.Scanner;
	class Q5
	{
		public static void converter(String str)
		{
			  String newStr= str.replaceAll("[^a-zA-Z0-9]" , "");
			  System.out.println(newStr);
			
			//String newStr= str.replaceAll(" ", "");
		    //System.out.println(newStr);
		}
		
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.nextLine();
			Q5 c = new Q5();
			
			Q5.converter(str);
			
		}
		
	}
		
	
	