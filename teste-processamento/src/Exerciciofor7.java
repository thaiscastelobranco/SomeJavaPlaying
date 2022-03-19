import java.util.Locale;
import java.util.Scanner;

public class Exerciciofor7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N;
		double nQuadrado, nCubo;
		N = sc.nextInt();
		
		
		for (int i = 1; i <= N; i++) {
			nQuadrado = (int)Math.pow(i, 2);
			nCubo = Math.pow(i, 3);
			
			System.out.print(i);
			System.out.println(" " + (int)nQuadrado + " " + (int)nCubo);
		}

	}

}
