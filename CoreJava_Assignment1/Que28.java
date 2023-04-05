/*
28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
(Note: Here you can use doubleToLongBits() method along 
        with methods of Long class).
*/

class Que28
{
    public static void main(String args[])
    {
        //double value into String
        double d = 23.0;
        String s = Double.toString(d);
        System.out.println("double value into String"+s);

        Double d1 = new Double(d);
        System.out.println("double value into Double instance."+d1);

        String s1 = new String("123");
        Double d2 = new Double(s1);
        System.out.println(" String instance into Double instance."+d2);

        
        //d. double value into binary, octal and hexadecimal string
        double d3 = 2.0;
        long l = Double.doubleToLongBits(d3);
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toOctalString(l));
      





    }
}