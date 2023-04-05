

// 3. Book Inventory Management System

class Book
{
    String title;
    String author;
    String publisher;
    String isbn;

    int year; 
    double price;
    int quantity;

//---------------------------------------------------------------------------------------------------------

   // Parameterless Constructor:
    Book()
    {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.year = 0;
        this.price = 0;
        this.qty = 0;
    }

//-----------------------------------------------------


    void setTitle(String t)
    {
        this.title = t;
    }

    void setAuthor(String a)
    {
        this.author = a;
    }
    void setPublisher(String p1)
    {
        this.publisher = p1;      
    }

    void setIsbn(String i)
    {
        this.isbn = i;
    }
    void setYear(int y)
    {
        this.year = y;
    }

    void setPrice(double p)
    {
        this.price = p;
    }
    void setQuantity(int q)
    {
        this.quantity = q;
    }


//------------------------------------------------------

String getTitle()
{
    return this.title;
}

String getAuthor()
{
     return this.author;     
}

String getPublisher()
{
    return this.publisher;
}

String getIsbn()
{
     return this.isbn;
}

int getYear()
{
    return this.year;
}

double getPrice()
{
    return this.price;
}

int getQuantity()
{
    return this.quantity;
}
//------------------------------------------------------------

public void increaseQuantity(int quantity1 )
{
    this.quantity = this.quantity + quantity1;
    System.out.println(this.quantity);
}

public void decreaseQuantity(int quantity2)
{
     this.quantity = this.quantity - quantity;
    System.out.println(this.quantity);
}

public double getInventoryValue()
{
    double  total_value = this.price * this.quantity;
    return total_value;
}



}


//=======================================================================================================

class EmployeeTest{

   
    }
}