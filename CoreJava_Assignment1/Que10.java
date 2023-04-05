/*
10.Write a program to perform below operations on char type to get:
 a. The number of bits used to represent a char value 
 b. The number of bytes used to represent a char value 
 c. The minimum value a char
 d. The maximum value a char
*/

class Que10
{
    public static void main(String args[])
    {
        //static int	SIZE
        System.out.println(Character.SIZE);//16
        System.out.println(Character.BYTES);// 2
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);


    }
}


