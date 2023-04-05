
/* 6.
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance
*/

class Que6
{
    public static void main(String args[])
    {
       // a. boolean value into String
       //     P     ====>>        NP  
       boolean a = true;
       String b = Boolean.toString(a);
       System.out.println(b);//true
       
     // b.boolean value into Boolean instance.
     boolean e = true;
     Boolean f  = new Boolean(e);
     System.out.println(f);// true
        


    // c. String value into boolean value 
      boolean d = Boolean.parseBoolean("true");
      System.out.println(d);



     // d. String value into Boolean instance
     String m = "true"; // other string the false value will be treated
     Boolean n = new Boolean(m);
     System.out.println(n);// true  

     
    }
}