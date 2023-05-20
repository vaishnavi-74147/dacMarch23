/*Example Input: "He#llo $Wo%rld1!"
Example Output: "HelloWorld1"*/

	import java.util.Scanner;
	class Q4
	{
		public static void converter(String str)
		{
			String newStr= str.replaceAll("[^a-zA-Z0-9]" , "");
			System.out.println(newStr);
			
		}
		
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.nextLine();
			Q4 c = new Q4();
			
			Q4.converter(str);
			
		}
		
	}
		
	
	