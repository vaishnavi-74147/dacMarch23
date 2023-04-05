
/*
25.Write a program to convert state of Float instance into
 byte, short, int, long, float and double.
 */

 class Que25
 {
    public static void main(String args[])
    {
        Float in = new Float(23.0);
        
        //byte num1 = in.byteValue();
        //System.out.println("Float instance into byte: "+(byte)num1);
        System.out.println( in.byteValue());

        short num2 = in.shortValue();
        System.out.println("Flaot instance into short: "+(short)num2);

        //int num3 = in.intValue();
        //System.out.println("Float instance into int: "+(int)num3);
        System.out.println(in.intValue());

       // long num4 = in.intValue();
       // System.out.println("float instance into long : "+num4);
        System.out.println(in.longValue());

        

        double num6 = in.doubleValue();
        System.out.println("Flaot instance into double: "+(double)num6);
    }
 }