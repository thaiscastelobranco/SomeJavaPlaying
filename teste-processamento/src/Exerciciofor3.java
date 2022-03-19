import java.util.Locale;
import java.util.Scanner;

public class Exerciciofor3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();

		double mediaPonderada = 0;
		
		for (int i = 0; i < N; i++) {
			double X, Y, Z;
			X = sc.nextDouble();
			Y = sc.nextDouble();
			Z = sc.nextDouble();
			mediaPonderada = (X * 0.2) + (Y * 0.3) + (Z * 0.5);
			System.out.printf("%.1f%n", mediaPonderada);
		}
		sc.close();
	}

}
