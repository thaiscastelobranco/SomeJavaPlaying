import java.util.Locale;
import java.util.Scanner;

public class Exemplodowhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char saida;
		
		do {
			System.out.println("Digite a temperatura em celsius: ");
			double C = sc.nextDouble();
			double F = ((9* C) / 5) + 32;
			System.out.printf("O equivalente em Fahrenheit: %.1f%n",  F);
			System.out.println("Deseja repetir (s/n)?");
			saida = sc.next().charAt(0);
		} while (saida != 'n');
		sc.close();

	}

}
