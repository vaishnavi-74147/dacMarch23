 /*
 Pass integer, float and double value from command line.
 Parse it appropriately andperform arithmetic operations (+,-,*,/) on it.
 Here you can you switch case.
 */

 class Que33
 {
    public static void main(String args[])
    {
        
        
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        double c = Double.parseDouble(args[2]);
        

           System.out.println("Addition :          "+(a+b+c));
           System.out.println("Subtracrion :     "+(a-b-c));
           System.out.println("Multiplication : "+(a*b*c));
           System.out.println("Multiplication : "+(a/b/c));
           

       




        


    }
 }