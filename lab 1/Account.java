class Account {
	protected double balance;
	public void withDraw(double amount) {

	}
	public void deposit(double amount) {

	}

}
class SavingAccount extends Account {
	private double defaultInterestRate=2.5;
	private double interest;
	public void setDefaultRate(double rate) {

	}
	public void applyMonthlyInterest() {

	}

	public static void main(String[] args) {
		SavingAccount saving=new SavingAccount();
	}
}