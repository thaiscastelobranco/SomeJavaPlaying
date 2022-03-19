package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class ProgramLer1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product1[] vect = new Product1[n];
		for (int i = 0; i < vect.length; i++) { // ao invés de n poderia usar vect.length
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product1(name, price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE: %.2f%n: ", avg);
		
		
		sc.close();
	}

}
