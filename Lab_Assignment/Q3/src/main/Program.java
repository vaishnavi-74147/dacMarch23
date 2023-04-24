package main;

import java.util.Scanner;

//TODO: to paste question.
public class Program {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String  s = sc.next();
		
		//Exception Handling
		while (!s.matches("[a-zA-Z]+")) {
		      System.out.print("Invalid input. Please enter a string containing only alphabetic characters: ");
		      s = sc.nextLine();
		    }
		
		// Reverse the String
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
