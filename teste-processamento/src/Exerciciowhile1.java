import java.util.Scanner;

public class Exerciciowhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua senha de quatro n�meros: ");
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inv�lida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
