/*
30.Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.
*/

 public class Que30
 {
    public static void main(String args[])
    {
        Double a = 34.45;
        Double  b = 78.57;

        double min = Double.min(a,b);
        double max = Double.max(a,b);
        double sum = Double.sum(a,b);
         System.out.println(max);
         System.out.println(min);
          System.out.println(sum);
    }
 }