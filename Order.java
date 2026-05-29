abstract public Order
{
	String customername;
	String food;
	int quantity;
	double price;
	Order()
	{
		System.out.println("Welcome to our restarunt !");
	}
	Order(String name ,String food,int quantity,double price)
	{
		this.customername=name;
		this.quantity=quantity;
		this.price=price;
	}
	abstract void orderfood();
	void bill()
	{
		double total=quantity*price;
		System.out.println("customername :"+customername);
		System.out.println("price per item :"+price);
		System.out.println("Total quantity :"+quantity);
		System.out.println("Total bill amount is :"+total);
}
class Placeorder extends Order
{
	
	void orderfood(String food,int quantity,double price)
	{
		System.out.println("You have ordered food : "+food);
		System.out.println("quantity : "+quantity);
	}
}
class Restarunt
{
	public static void main(String[] args)
	{
		Placeorder obj=new Placeorder();
		obj.orderfood("pizza",2,150.0);
		obj.bill();
	}
}