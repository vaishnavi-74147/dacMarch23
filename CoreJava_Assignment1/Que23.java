/*
23.Write a program to perform below operations on float type to get: 
a. The number of bits used to represent a float value 
b. The number of bytes used to represent a float value 
c. The minimum value a float 
d. The maximum value a float
*/

class Que23
{
        public static void main(String args[])
        {
         System.out.println(Float.SIZE);// 32
         System.out.println(Float.BYTES);// 4
         System.out.println(Float.MAX_VALUE);// 3.4028235E38
         System.out.println(Float.MIN_VALUE);// 1.4E-45
        }

}