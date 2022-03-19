import java.util.Scanner;

public class Exerciciofor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int soma1, soma2;
		soma1 = 0;
		soma2 = 0;

		for (int i = 0; i < N; i++) {
			int x;
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				soma1 = soma1 + 1;
			} else {
				soma2 = soma2 + 1;
			}
		}
		sc.close();
		System.out.println(soma1 + " in");
		System.out.println(soma2 + " out");
	}
}
