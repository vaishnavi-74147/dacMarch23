/*
a. dd/mm/yyyy (e.g., 31/12/2022)
b. mm/dd/yyyy (e.g., 12/31/2022)
c. yyyy/mm/dd (e.g., 2022/12/31)
*/

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
         int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        Date date = new Date(year-1900,month-1,day);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String dp1 = sdf1.format(date);
        System.out.println(dp1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("mm/dd/yyyy ");
        String dp2 = sdf2.format(date);
        System.out.println(dp2);

        SimpleDateFormat sdf3= new SimpleDateFormat(" yyyy/mm/dd ");
        String dp3 = sdf3.format(date);
        System.out.println(dp3);

        System.out.println("--------------------------------------");

        










    }
}