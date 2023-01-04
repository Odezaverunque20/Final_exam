public class Main
{
  public static void main(String[]orgs){
		Customer Customer;
		RegularCustomer RegularCustomer = new RegularCustomer("Dezzy", 1000);
		SeniorCustomer  SeniorCustomer = new SeniorCustomer("Rexxy", 1000);

		Customer = RegularCustomer;
		
		
		System.out.println(Customer.calculateBill() + "\t" + Customer.getName() + ".");

		Customer = SeniorCustomer;
		
		
		System.out.println(Customer.calculateBill() + "\t" + Customer.getName() + ".");
    }
}
