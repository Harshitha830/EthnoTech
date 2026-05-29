class Savings extends Employe {

    double fine;
	void Savings(double fine)
	{
		this.fine=fine;
	}

    void addInterest(double fine) {

        double interest = (bal * this.fine) / 100;

        bal += interest;

        System.out.println("Interest Added: " + interest);
    }
}