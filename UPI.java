interface Cash
{
	void cash(int amo);
}
interface UPIS
{
	void upi();
}
class Payment implements UPIS,Cash
{
	public void cash(int amo)
	{
		System.out.println("Through cash payment "+amo);
	}
	public void upi()
	{
		System.out.println("Through UPI's or payments ");
	}
}
class UPI
{
	public static void main(String[] args)
	{
		Payment p=new Payment();
		p.cash(300);
		p.upi();
	}
}