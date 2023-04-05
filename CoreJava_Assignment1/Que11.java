/*
11.Accept character from command line and perform below operations. 
   Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit.
   If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase?
   If it is in lowercase then convert it into upper case and 
   print it well as its code point. If it is in uppercase
   then convert it into lower case and print it well as its code point.
   */

  class Que11
  {
   public static void main(String args[])
   {
      char c = args[0].charAt(0);
      int i = c;
      char arr[] = new char[1];
      
      arr[0] = c;
      String s = Character.toString(c);

      if((i>=65 && i<=90) || (i>=97 && i<=122))
      {
         System.out.println("Character is letter");
      }
      else if(i>=48 && i<=57)
      {
         System.out.println("digit "+i);
         System.out.println("unicode :"+Character.codePointAt(arr));
      }

      }

   }
  

  