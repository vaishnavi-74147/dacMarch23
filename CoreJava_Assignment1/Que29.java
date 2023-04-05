/*
29.Write a program to convert state of Double instance into
 byte, short, int, long, float and double
 */

 class Que29
 {
    public static void main(String args[])
    {
        Double in = new Double(23.0);

         byte num1 = in.byteValue();
        System.out.println("Double instance into byte: "+(byte)num1);

        short num2 = in.shortValue();
        System.out.println("Double instance into short: "+(short)num2);

        int num3 = in.intValue();
        System.out.println("Double instance into int: "+(int)num3);

        long num4 = in.intValue();
        System.out.println("Double instance into long : "+(long)num4);

        float num6 = in.floatValue();
        System.out.println("Double instance into float: "+(float)num6);
    }
 }