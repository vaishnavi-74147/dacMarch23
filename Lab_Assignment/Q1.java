/*
 You are given two integer variables, a and b. Write a Java function that swaps the values of a
and b. The function should not use a third variable. The function should take two integer
arguments and return the swapped values.
For example, if the user inputs a=5 and b=10, the function should print "a=10, b=5".
 */

import java.util.Scanner;

class Swap
{
    public static void swap(int[] arr1)
    {
        arr1[0] = arr1[0] + arr1[1];
        arr1[1] = arr1[0] - arr1[1];
        arr1[0] = arr1[0] - arr1[1];
    }
   

}

class Q1
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[2];
    System.out.println("Enter the first element");
     arr[0] = sc.nextInt();
     System.out.println("Enter the Second element");
     arr[1] = sc.nextInt();

     Swap.swap(arr);

     System.out.println("arr[0] = "+arr[0]);
     System.out.println("arr[1] = "+arr[1]);





    }

}