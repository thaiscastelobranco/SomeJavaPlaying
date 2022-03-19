package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class BankProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); // colocado para consumir a quebra de linha do nextInt
		String name = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		Bank bank;
		
		if (answer == 'y' || answer == 'Y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			bank = new Bank(number, name, value);
			
		} else {
			bank = new Bank(number, name);
		}
		
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		bank.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println("Enter withdraw value: ");
		double value1 = sc.nextDouble();
		bank.withdraw(value1);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		sc.close();
	}
}
