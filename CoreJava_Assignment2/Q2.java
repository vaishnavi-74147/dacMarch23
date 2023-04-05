

// 1. Date and Time Converter

class BMI
{
    // Fields:
    double height;
    double weight;


    // Constructor
    BMI(double h,double w)
    {
        System.out.println("Inside Parameterized Constructor");
        this.height = h;
        this.weight = w;
    } 


    // Setter
    void setHeight(double h)
    {
        this.height = h;
    }

     void setWeight(double w)
    {
        this.weight = w;
    }

    //getter:
    double getHeight()
    {
        return this.height;
    }

    double getWeight()
    {
        return this.weight;
    }

    // BMI calculator
     void bmiCalculator()
     {
        double BMI;
        BMI = this.weight/(this.height*this.height);
        System.out.println("BMI = "+BMI);
     }


}

//---------------------------------------------------------------------------------



    class Q2{

    public static void main(String args[])
    {
        BMI b = new BMI(5,45);
        b.bmiCalculator();


        b.setHeight(6);
        b.setWeight(50);

       double h = b.getHeight();
       double w = b.getWeight();
       System.out.println("h in feet "+h+ "  w in kg= "+w);


       b.bmiCalculator();





        
    }
}