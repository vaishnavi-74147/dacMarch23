/*Byte class:
a. The number of bits used to represent a byte value 
b. The number of bytes used to represent a byte value
c. The minimum value a byte 
d. The maximum value a byte
*/

class Que7
{
    public static void main(String args[])
    {
        //a. The number of bits used to represent a byte value 
           System.out.println("SIZE: "+Byte.SIZE);//8

        // b. The number of bytes used to represent a byte value
            System.out.println("BYTE: "+Byte.BYTES);//1

        //c. The minimum value a byte 
          System.out.println("MIX_VALUE: "+Byte.MIN_VALUE);//-128

        // d. The maximum value a byte
          System.out.println("MAX_VALUE:  "+Byte.MAX_VALUE);//127

    }
}