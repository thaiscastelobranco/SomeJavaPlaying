import java.util.Locale;
import java.util.Scanner;

public class Exerciciofor4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double N1, N2;
			N1 = sc.nextInt();
			N2 = sc.nextInt();
			if (N2 != 0) {
				System.out.printf("%.1f%n", N1 / N2);
			} else {
				System.out.println("divisao impossível");
			}
		}
		sc.close();
	}
}
