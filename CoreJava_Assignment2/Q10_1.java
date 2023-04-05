
// 10. Credit Score Calculator Practice Question
import java.util.Scanner;
class CreditScoreCalculator 
{
    
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;
    
      
    public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory)
    {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }
    
    public int getCreditHistory() 
    {
        return creditHistory;
    }
    
    public void setCreditHistory(int creditHistory)
    {
        this.creditHistory = creditHistory;
    }
    
    public double getCreditUtilization()
    {
        return creditUtilization;
    }
    
    public void setCreditUtilization(double creditUtilization) 
    {
        this.creditUtilization = creditUtilization;
    }
    
    public boolean getPaymentHistory()
     {
        return paymentHistory;
    }
    
    public void setPaymentHistory(boolean paymentHistory)
     {
        this.paymentHistory = paymentHistory;
    }
    
    public int calculateCreditScore() 
    {
        int creditScore;
        if (paymentHistory)
        {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        } else 
        {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        return creditScore;
    }    
}

class Q10_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        CreditScoreCalculator csc1 = new CreditScoreCalculator(123,0.3,true); 
        int n =  csc1.calculateCreditScore();
        System.out.println("Credit Score: "+n);

        System.out.printf("Enter the creditHistory : ");
        int h = sc.nextInt();
        System.out.printf("Enter the creditUtilization: ");
        double  u = sc.nextDouble();
        System.out.printf("Enter the paymentHistory: ");
        boolean b = sc.nextBoolean();

        CreditScoreCalculator csc2 = new CreditScoreCalculator(h,u,b);
        int n1 = csc2.calculateCreditScore();
        System.out.println("Credit Score: "+n1);  
    }
}

