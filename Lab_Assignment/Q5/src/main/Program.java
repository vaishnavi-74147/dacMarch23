/*
 		You are given a string s that contains a sentence. 
		Write a Java function that counts the number of words in the sentence. 
		The function should take the string as input and return the count of words in the sentence. 
		The function should handle input that contains non-alphabetic characters and 
		prompt the user to re-enter valid input.
*/

package main;

import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	
	static String function()
	{
		System.out.println("Enter the String");
		while(true) {
			String str = sc.nextLine();
			int j=0;
//-----------------------------------------------------------
			for(int i=0; i<str.length() ; i++)
			{
				Character c = str.charAt(i);
				if(!Character.isAlphabetic(c)){
					if(Character.isSpaceChar(c))
						continue;
					    j = 1;
					    break;
				}
		     }
//----------------------------------------------------------
	
	if(j==1) {
		System.out.println("Invalid input!");
		System.out.println("Re-enter the string.:");
		continue;
	}
//----------------------------------------------------------
	else {
		return str;
	}
  }
}
//---------------------------------------------------------------------------	
	
	public static void main(String[] args)
	{
        String str = function();
		
		String arr[]=str.split(" ");
		
		System.out.println("No of words.:"+arr.length);
		
	}

}
