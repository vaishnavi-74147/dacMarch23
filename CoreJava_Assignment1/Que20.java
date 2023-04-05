/*
20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
*/

class Que20
{
    public static void main(String args[])
    {
        //long value into String
        Long l = new Long(23);
        String s1 = Long.toString(l);
        System.out.println("long value into String "+s1);

        Long l1 = new Long(l);
        System.out.println("long value into String "+l1);

        String s2 = new String("123");
        System.out.println("String instance into Long instance "+s2);


//=========================================================================


         long num3 = 2L;
         String num4 = Long.toBinaryString(num3);
         System.out.println("long value into binary: "+num4);


        long num5 = 3L;
        String num6= Long.toOctalString(num5);
        System.out.println("long value into Octal: "+num6);

         long num7 = 5L;
         String num8 = Long.toHexString(num7);
         System.out.println("long value into Hexadecimal: "+num8);

       




    }
}