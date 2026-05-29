class Student
{
	private int id;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.setid(10);
		int res=obj.getid();
		System.out.print(res);
	}
}

