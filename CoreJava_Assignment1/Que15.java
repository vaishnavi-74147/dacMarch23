
/*
15. Write a program to perform below operations on int type to get:
 a. The number of bits used to represent a integer value 
 b. The number of bytes used to represent a integer value 
 c. The minimum value a integer
 d. The maximum value a integer
  */

class Que15
{
    public static void main(String args[])
    {
        System.out.println(Integer.SIZE);//32
        System.out.println(Integer.BYTES);//4
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

    }
}
