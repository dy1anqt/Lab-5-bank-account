package bankAccountLab;
public class BankAccount {
private double StringBuilder;
public BankAccount() {
	this(0);
}
public BankAccount(double balance) {
	this.StringBuilder = balance;
}
public  double getBalance() {
	return StringBuilder;
}
public void setBalance(double balance) {
	this.StringBuilder = balance;
}
public void withdraw(double amount) {
	if (amount<=0) {
		throw new IllegalArgumentException("No negative values");
	}
	if (amount> StringBuilder) {
		throw new IllegalArgumentException("Not enough money");
		
	}
	StringBuilder-=amount;
	
}
public void deposit(double amount) {
	if (amount<=0) {
		throw new IllegalArgumentException("Positive values only");
	}
	StringBuilder+=amount;
		
}
public void print() {
	System.out.printf("The amount the account has: $%.2f\n", StringBuilder);
	
}

}



