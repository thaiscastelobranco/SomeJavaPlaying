import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi, r, a;
		
		r = sc.nextDouble();
		pi = 3.14159;
		a = pi * Math.pow(r, 2.0);
		
		System.out.printf("A = %.4f%n", a);
		sc.close();
	}

}
