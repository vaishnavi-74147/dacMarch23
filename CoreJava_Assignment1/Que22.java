
/*
22. Write a program to find minimum and maximum number as well as
 to add two long numbers using methods of Long.
 */

 public class Que22
 {
    public static void main(String args[])
    {
        long a = 345678L;
        long b = 785729781L;

        long min = Long.min(a,b);// to find mimimum number
        long max = Long.max(a,b);
        long sum =Long.sum(a,b);
        System.out.println(max);
         System.out.println(min);
          System.out.println(sum);
    }
 }