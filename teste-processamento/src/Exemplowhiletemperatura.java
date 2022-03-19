import java.util.Locale;
import java.util.Scanner;

public class Exemplowhiletemperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		char saida = 's';
		
		while (saida != 'n') {
			System.out.print("Digite a temperatura em celsius: ");
			double C = sc.nextDouble();
			double F = ((9* C) / 5) + 32;
			System.out.printf("O equivalente em Fahrenheit: %.2f%n",  F);
			System.out.print("Deseja repetir (s/n)?");
			saida = sc.next().charAt(0);
		}

		sc.close();
	}

}
