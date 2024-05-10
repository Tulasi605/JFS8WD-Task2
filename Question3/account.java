package Task2;

public class account {
	private double balance;

    public account() {
        balance = 0.0;
    }

    public account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
    	account account1 = new account();
        account1.displayBalance();

        account1.deposit(100);
        account1.displayBalance();

        account1.withdraw(50);
        account1.displayBalance();

        account account2 = new account(500);
        account2.displayBalance();

        account2.withdraw(600);
        account2.displayBalance();

        account2.deposit(200);
        account2.displayBalance();
    }
}
