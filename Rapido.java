class Vehicle
{
	int fare;
	String name;
	String vehi_name;
	double dist;
	Vehicle(int fare,String name,String vehi_name,double dist)
	{
		this.fare=fare;
		this.name=name;
		this.vehi_name=vehi_name;
		this.dist=dist;
	}
	void vehi_fare()
	{
		double cost=fare *dist;
		System.out.println(" passenger name :"+name);
		System.out.println("vehical name :"+vehi_name);
		System.out.println("fare per dist :"+fare);
		System.out.println("fare cost : "+cost);
		System.out.println("total Distance :"+dist+" km");
		System.out.println("Booked successfully ");
	}
}
class bike extends Vehicle
{
	bike()
	{
		super(80,"harshitha","bike",2);
	}
}
class auto extends Vehicle
{
	auto()
	{
		super(180,"harshitha","Auto",4);
	}
}
class cab extends Vehicle
{
	cab()
	{
		super(250,"harshitha","cab",2);
	}
}	
class Rapido
{
	public static void main(String[] args)
	{
		Vehicle v=new bike();
		v.vehi_fare();
		Vehicle a=new auto();
		a.vehi_fare();
		Vehicle c=new cab();
		c.vehi_fare();
	}
}