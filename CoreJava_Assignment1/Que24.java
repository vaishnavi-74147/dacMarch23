/*
24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
*/

class Que24
{
    public static void main(String args[])
    {
        float f = 23.0f;
        String str = Float.toString(f);
        System.out.println("float value into String "+str);

        Float f1 = new Float(f);
        System.out.println("float value into Float instance. "+f1);

        String str2 = new String("123");
        Float f2 = new Float(str2);

         float f3 = 5.0f;
         String str3 = Float.toHexString(f3);
         System.out.println("long value into Hexadecimal: "+str3);
        


    }
}