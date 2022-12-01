package bankAccountLab;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		Scanner scnr = new Scanner(System.in);
		int userInt;
		double amount;
		while(true) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Return Statement");
			System.out.println("4. Exit");
			System.out.print("Enter your option 1-4: ");
			userInt = scnr.nextInt();
			try {
				switch(userInt) {
				case 1:
					System.out.print("Enter how much you want to deposit:$");
					amount= scnr.nextDouble();
					bankAccount.deposit(amount);
					break;
				case 2:
					System.out.print("Enter how much you would like to withdraw:$");
					amount= scnr.nextDouble();
					bankAccount.withdraw(amount);
					break;
				case 3:
					bankAccount.print();
					break;
				case 4: 
					System.out.println("Thank you! Have a nice day!");
					return;
				}
				}catch (Exception h) {
					System.out.println(h.getMessage());
					
					
				}
				System.out.println();
				
			}
			
		}

	}


