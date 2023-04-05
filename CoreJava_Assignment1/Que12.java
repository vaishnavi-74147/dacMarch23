
/*
12.Write a program to perform below operations on short type to get:
 a. The number of bits used to represent a short value 
 b. The number of bytes used to represent a short value 
 c. The minimum value a short 
 d. The maximum value a short
*/

class Que12
{
    public static void main(String args[])
    {
         System.out.println(Short.SIZE);// 16
         System.out.println(Short.BYTES);// 2
         System.out.println(Short.MAX_VALUE);// 32767
         System.out.println(Short.MIN_VALUE);// -32768

    }
}