package entities;

public class Bank {
	
	private int accountNumber; 
	private String name;
	private double balance;
	
	public Bank(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Bank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance = balance + value;
	}
	
	public void withdraw(double value) {
		balance = balance - value - 5.00;
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + "," + " Balance: $ " + String.format("%.2f", balance);
	}
}
