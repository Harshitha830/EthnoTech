class Employe
{
	double bal;
	void Employe(double bal)
	{
		this.bal=bal;
	}
	void withdraw(double amount)
	{
		bal=bal-amount;
		System.out.println("balance after withdraw amount : "+this.bal);
	}
	void deposit(double amount)
	{
		bal+=amount;
		System.out.println("balance after deposite amount : "+this.bal);
	}
	void displaybal()
	{
		System.out.println("Balance amount is : " +this.bal);
	}
}