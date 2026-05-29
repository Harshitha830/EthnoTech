class Bankbalance
{
	private double balance;
	public void amount(double balance)
	{
		this.balance=balance;
	}
	public double getamount()
	{
		return balance;
	}
	public static void main(String[] args)
	{
		Bankbalance obj1=new Bankbalance();
		obj1.amount(10);
		
		Bankbalance obj2=new Bankbalance();
		obj2.amount(20.5);
		System.out.println(obj1.getamount());
		System.out.println(obj2.getamount());
	}
}
