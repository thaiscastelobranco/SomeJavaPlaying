import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("S�o m�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		sc.close();
	}

}
