import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 0 a 100: ");
		double numero;
		numero = sc.nextDouble();
		
		if (numero >= 0 && numero <= 25) {
			System.out.println("INTERVALO [0,25]");
		}
		else if (numero > 25 && numero <= 50) {
			System.out.println("INTERVALO [25,50]");
		}
		else if (numero > 50 && numero <= 75) {
			System.out.println("INTERVALO [50,75]");
		}
		else if (numero > 75 && numero <= 100) {
			System.out.println("INTERVALO [75,100]");
		} 
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}
