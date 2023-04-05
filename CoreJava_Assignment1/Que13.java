
/*
Que:13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
*/

class Que13
{
    public static void main(String args[])
    {
        //Short --> String
        short a = 23;
        String b = Short.toString(a);//23
        System.out.println("short value into String: "+b);

        short c = 65;
        Short e = new Short(c);
        System.out.println("short value into Short instance: "+e);// 65

     // String instance into Short instance.
        String str = new String("123");
        Short sh = new Short(str);
        System.out.println("String instance into Short instance "+sh);//123



    }
}