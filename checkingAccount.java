public class checkingAccount extends BankAccount {

	public checkingAccount(int accNumb) {
		super(accNumb);
	}

	String accName = "Checking Account";

	double balance, penalty;

	@Override
	public void monthlyProcess() {

		balance = getBalance();

		if (balance < 10) {
			setStatus(false);
			penalty = balance;
			balance -= penalty;
			if (balance == 0)
				penalty += 1;
		}

	}

	public String toString() {
		return "accName " + accName + "\n" + "accNumb " + accNumb + "/n"
				+ "numWithdraws " + numWithdraws + "/n" + "balance " + balance
				+ "/n" + "status " + status;
	}
}
