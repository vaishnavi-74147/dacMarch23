
/*
16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
*/

class Que16
{
    public static void main(String args[])
    {
        int num1 = 123;
        String str = Integer.toString(num1);
        System.out.println("int value into String: "+str);

        
        Integer num2 = new Integer(num1);
        System.out.println("int value into Integer: "+str);

        
       int num3 = 2;
       String num4 = Integer.toBinaryString(num3);
       System.out.println("int value into binary: "+num4);


        int num5 = 2;
       String num6 = Integer.toOctalString(num5);
       System.out.println("int value into octal: "+num6);


        int num7 = 2;
       String num8 = Integer.toHexString(num7);
       System.out.println("int value into Hexadecimal: "+num8);




    }
}