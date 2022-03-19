import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		System.out.println("Vamos descobrir o quadrante que pertence dois números."
				+ "Insira o valor de x: ");
		x = sc.nextDouble();
		System.out.println("Agora insira o valor de y: ");
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}
		sc.close();
	}

}
