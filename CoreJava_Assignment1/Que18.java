
/*
18. Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.
*/

public class Que18
 {
    public static void main(String args[])
    {
        int  a = 345;
        int  b = 7857;

         int  min = Integer.min(a,b);
         int  max = Integer.max(a,b);
         int  sum = Integer.sum(a,b);
          System.out.println(max);
          System.out.println(min);
          System.out.println(sum);
    }
 }