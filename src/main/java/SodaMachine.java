public class SodaMachine {
	private float accountBalance = 0;

	public SodaMachine(float accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	public void restartMachine() {
	}

	public void putMoney(float value) {
		accountBalance += value;
	}

	public void releaseSoda() {
		if (accountBalance >= 2) {
			accountBalance -= 2;
			returnsChange(accountBalance);
			restartMachine();
		}
	}

	private void returnsChange(float accountBalance2) {
		if (accountBalance == 0) {
			pushChange();
		}
	}

	private void pushChange() {
	}

	public float getAccountBalance() {
		return accountBalance;
	}
}
