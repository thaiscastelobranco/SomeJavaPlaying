import java.util.Scanner;

public class Exerciciowhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, soma1, soma2,soma3;
		soma1 = 0;
		soma2 = 0;
		soma3 = 0;
		
		x = sc.nextInt();
		
		while (x != 4) {
			
			if (x == 1) {
				soma1 = soma1 + 1;
			}
			else if (x == 2) {
				soma2 = soma2 + 1;
			}
			else if (x == 3) {
				soma3 = soma3 + 1;
			}
			else {
				System.out.println("Código inválido. Digite novo número:");
			}
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + soma1);
		System.out.println("Gasolina: " + soma2);
		System.out.println("Diesel: " + soma3);
		sc.close();
	}

}
