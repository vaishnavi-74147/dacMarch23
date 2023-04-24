package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String  s = sc.next();
		String n ="";
		
		//Exception Handling
		while (!s.matches("[a-zA-Z]+")) 
		{
		      System.out.print("Invalid input. Please enter a string containing only alphabetic characters: ");
		      s = sc.nextLine();
	    }
		
		for(int i=s.length()-1; i>=0; i--) {
			n=n+(s.charAt(i));
		}
		if(s.equals(n))
			System.out.println("The string is a palindrome");
		else
			System.out.println("The string is NOT a palindrome");

	  
	}

}
