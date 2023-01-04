public class Customer
{
  private String name;
    double amount;

    //Constructor
    public Customer(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    //Method
    public abstract double calculateBill();

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
	}
}
