/*
26.Write a program to find minimum and maximum number as well as to 
add two float numbers using methods of Float.
*/

 public class Que26
 {
    public static void main(String args[])
    {
        float a = 34.45f;
        float b = 78.57f;

        float min = Float.min(a,b);
        float max = Float.max(a,b);
        float sum = Float.sum(a,b);
         System.out.println(max);
         System.out.println(min);
          System.out.println(sum);
    }
 }