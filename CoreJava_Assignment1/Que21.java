
/*
21.Write a program to convert state of Long instance into
 byte, short, int, long, float and double.
 */

 class Que21{

    public static void main(String args[])
    {
        
        Long in = new Long(23L);

       // int num1 = in.intValue();
       // System.out.println("Long instance into byte: "+(byte)num1);
         System.out.println(in.intValue());

       // short num2 = in.shortValue();
       // System.out.println("Long instance into short: "+(short)num2);
         System.out.println(in.shortValue());
        
        

        long num4 = in.intValue();
        System.out.println("Long instance into long: "+num4);

        float num5 = in.floatValue();
        System.out.println("Long instance into float: "+(float)num5);

        double num6 = in.doubleValue();
        System.out.println("Long instance into double: "+(double)num6);
        

        /*
          Long s = new Long(23L);
          System.out.println("byte "  +s.byteValue());
          System.out.println("short " +s.shortValue());
           System.out.println("int "  +s.intValue());
          // System.out.println("long " +((long)s));
           System.out.println("float "   +((float)s));
           System.out.println("double  " +((double)s));
           */
    }

 }