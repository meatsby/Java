package precourse.vendingmachine.domain;

public class Balance {
	private int balance;

	public Balance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void reduceBalance(int price) {
		balance -= price;
	}
}
