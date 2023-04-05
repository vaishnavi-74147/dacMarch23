

// 3. Book Inventory Management System

class ElectricityBill
{
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String CN,double UC)
    {
        this.customerName = CN;
        this.unitsConsumed = UC;
    }

    void calculateBillAmount()
    {
        if( this.unitsConsumed <= 100)
        {
            this.billAmount = 5;
        }
        else if( this.unitsConsumed < 200)
        {
             this.billAmount = 7;
        }
        else
        {
            this.billAmount = 10;
        }

    }

    void display()
    {
        System.out.println(" customerName = "+this.customerName+"  unitsConsumed =  "+this.unitsConsumed+"  billAmount =   "+ this.billAmount);
    }

}

class Q4
{
    public static void main(String arg[])
    {
    ElectricityBill eb = new ElectricityBill("Soni",400);
    eb.calculateBillAmount();
    eb.display();
    }
}