
/*
19.Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value 
b. The number of bytes used to represent a long value 
c. The minimum value a long
 d. The maximum value a long
 */

 class Que19
 {
    public static void main(String args[])
    {
         System.out.println(Long.SIZE);// 64
         System.out.println(Long.BYTES);// 8
         System.out.println(Long.MAX_VALUE);// 9223372036854775807
         System.out.println(Long.MIN_VALUE);// -9223372036854775808
    }
 }