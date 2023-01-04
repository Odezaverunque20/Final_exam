public class RegularCustomer
{
  private double amount;

    public RegularCustomer(String name, int amount){

        super(name, amount);
        this.amount = amount;
    }

   
    public double calculateBill(){
        return amount; 
    }
    public double getAmount(){
        return amount;
    }
    public double setAmount(double amount){
    return amount;
	

  }
}
