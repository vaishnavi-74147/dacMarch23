/*Q8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/

class Que8
{
    public static void main(String args[])
    {
        //a. byte value into String
        byte byte1= 23;
        String str1= Byte.toString(byte1);
        System.out.println(" byte value into String:"+str1);//23

        //b. byte value into Byte instance.
        byte byte2 = (byte)180;
        Byte byte3 = new Byte(byte2);//Instance.
        System.out.println("byte value into Byte instance:"+byte3);//45

        //c. String instance into Byte instance.
        
         //String str2 = new String("1234"); NFE 
         String str2 = new String("123");
        Byte byte4  = new Byte(str2);
        System.out.println("byte value into Byte instance:"+byte4);//123

    }
}