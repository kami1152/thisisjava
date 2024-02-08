package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() { }

	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
//	public boolean withdraw(int money)  {
//		if (balance > money) {
//			balance = balance - money;
//			return true;
//		}
//		return false;
//	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고 부족: "+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}