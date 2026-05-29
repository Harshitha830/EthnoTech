class Employee
{
	public static void main(String[] args)
	{
		Name obj=new Name();
		obj.salary();
		obj.role();
		obj.name();
	}
}
class Salary
{
	void salary()
	{
		System.out.println(" 1-lakh ruupees ");
	}
}
class Roles extends Salary
{
	void role()
	{
		System.out.println("Manager ");
	}
}
class Name extends Roles
{
	void name()
	{
		System.out.println(" Harshitha ");
	}
	
}
	