
/*
27.Write a program to perform below operations on Double type to get:
 a. The number of bits used to represent a double value 
 b. The number of bytes used to represent a double value 
c. The minimum value a double 
d. The maximum value a double
*/
class Que27
{
    public static void main(String args[])
    {
         System.out.println(Double.SIZE);// 64
         System.out.println(Double.BYTES);// 8
         System.out.println(Double.MAX_VALUE);// 1.7976931348623157E308 
         System.out.println(Double.MIN_VALUE);// 4.9E-325
    }
}