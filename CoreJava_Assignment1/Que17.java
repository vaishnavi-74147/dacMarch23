
/*
17. Write a program to convert state of Integer instance
 into byte, short, int, long, float and double
 */

 class Que17
 {
    public static void main(String args[])
    {
        Integer in = new Integer(23);

        
        //int num1 = in.byteValue();
       // System.out.println("Short instance into byte: "+(byte)num1);
       System.out.println(in.byteValue());

       // short num2 = in.shortValue();
       //System.out.println("Short instance into short: "+(short)num2);
        System.out.println(in.shortValue());

        int num3 = in.intValue();
        System.out.println("Short instance into int: "+num3);

        long num4 = in.longValue();
        System.out.println("Short instance into long: "+num4);

        float num5 = in.floatValue();
        System.out.println("Short instance into float: "+num5);

        double num6 = in.doubleValue();
        System.out.println("Short instance into double: "+num6);
        


         /*
          Integer s = new Integer(23);
          System.out.println("byte "+s.byteValue());
          System.out.println("short " +s.shortValue());
           //System.out.println("int "+((int)s));
           System.out.println("long " +((long)s));
           System.out.println("float " +((float)s));
           System.out.println("double  " +((double)s));
           */
    }
 }

 /*
          System.out.println("byte "+s.byteValue());
          System.out.println("short "+((short)s));
           System.out.println("int "+((int)s));
           System.out.println("long "+((long)s));
           System.out.println("float "+((float)s));
           System.out.println("double  "+((double)s));


 */