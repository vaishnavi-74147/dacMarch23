package main;

import java.util.Scanner;

/*
You are given an integer array of size n. Write a Java function that finds the sum of all the
elements in the array. The function should take the array as input and return the sum of the
array elements. The function should handle invalid input, such as non-integer inputs, and
prompt the user to re-enter valid input.
For example, if the user inputs an array [1, 2, 3, 4, 5], the function should print "The sum of
the elements in the array is: 15".
*/




public class Sum {


    public static int sum(int[] arr)
    {
        System.out.println("Sum of array element");
        int sum = 0;
        for(int i=0;i<arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }


    public static void acceptArr(int[] arr)
    {
        System.out.println("Enter array element");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length; i++)
        {
            try {
				arr[i] = sc.nextInt();
			} catch (Exception e) {
				System.out.println("non-integer inputs...re-enter the input");
			}
    }
    }

    public static void printArr(int[] arr)
    {
        System.out.println("Enter array elements are");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length; i++)
        {
           System.out.println(arr[i]);
        }

    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        Sum.acceptArr(arr);
        Sum.printArr(arr);
        int sum = Sum.sum(arr);
        System.out.println(sum);



        
    }
}

