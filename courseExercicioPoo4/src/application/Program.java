package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double priceDollar = sc.nextDouble();
		System.out.println("How Many dollars will be bought?");
		double dollaresBought = sc.nextDouble();
		double total = CurrencyConverter.totalPrice(priceDollar, dollaresBought);
		
		System.out.printf("Amount paid in reais = R$ %.2f", total);
		
		sc.close();
	}

}
