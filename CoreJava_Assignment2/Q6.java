// 6. Bank Account Management System
import java.util.Scanner;
class BankAccount
{
   
    //Fields:
    private int account_no;
	private String name;
	private double balance;
    

    public void CreateAccount()
    {
        System.out.println("Create a Account");
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Account Holders Name: ");
         this.name = sc.nextLine();
         System.out.print("Enter the Account Number: ");
         this.account_no = sc.nextInt();
         System.out.println("Enter the Balance:");
         this.balance = sc.nextDouble();
    }

    public void Deposit()
    {
        System.out.println("Procedure to deposit the amount");
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Amount to be Deposited: ");
        int Deposit = sc.nextInt();
        System.out.print("Enter the Account Number: ");
        int Acc_No = sc.nextInt();
         if(this.account_no == Acc_No)
         {
            System.out.println("Account number valid");
            this.balance =  this.balance + Deposit;
            //System.out.println("The balance amount is : "+this.balance);
         }
         else
         {
            System.out.println("Account number Invalid");
         }
    }


    public void Withdraw()
    {
        System.out.println("Procedure to withdraw the amount");
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Account Number: ");
         int Acc_No = sc.nextInt();
          System.out.print("Enter the Amount to be withdrawn: ");
        int Withdraw = sc.nextInt();

        if(this.account_no  == Acc_No)
        {
            System.out.println("Account number valid");
            if(this.balance > Withdraw)
            {
                 System.out.println("Account is Sufficient");
                 this.balance = this.balance - Withdraw;
                 // System.out.println("The balance amount is :"+this.balance);
            }
            else
            {
                 System.out.println("Account is Insufficient");
            }
        }
        else
         System.out.println("Account number Invalid");
    }


    public void Display_Acc_Bal()
    {
        System.out.println("Procedure to display the Account Balance");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Number: ");
        int Acc_No = sc.nextInt();

        if(this.account_no == Acc_No)
        {
            System.out.println("Balance Amount: "+this.balance);
        }
        else
        {
            System.out.println("Account number Invalid");
        }
    }

    public void AccInfo()
    {
        System.out.println("Procedure to display the Account Holders Information");
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Number: ");
        int Acc_No = sc.nextInt();

        if(this.account_no == Acc_No)
        {
            System.out.println("Account Holder Name: "+this.name);
            System.out.println("Balance Amount: "+this.balance);
        }
        else
        {
            System.out.println("Account number Invalid");
        }

    }

}

class Q6
{
    public static void main(String args[])
    {
        BankAccount ba = new BankAccount();
        ba.CreateAccount();
        ba.Deposit();
        ba.Withdraw();
        ba.Display_Acc_Bal();
        ba.AccInfo();

    }
}