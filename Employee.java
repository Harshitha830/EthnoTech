class Employee
{
	public static void main(String[] args)
	{
		Name obj=new Name();
		
		obj.salary(75000.78);
		obj.role("manager");
		obj.name("harshitha");
	}
}
class Salary
{
	double sal;
	void salary(double sal)
	{
		System.out.println(" salary: "+sal);
	}
}
class Roles extends Salary
{
	String role;
	void role(String role)
	{
		System.out.println(" Role :  "+role);
	}
}
class Name extends Roles
{
	String str;
	void name(String str)
	{
		System.out.println(" name : "+str);
	}
}
	