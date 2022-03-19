import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numeroDePecas1, codPeca2, numeroDePecas2;
		double valorUnitario1, valorUnitario2, total1, total2, valorPagar;
		
		codPeca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		total1 = numeroDePecas1 * valorUnitario1;
		total2 = numeroDePecas2 * valorUnitario2;
		valorPagar = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);
		sc.close();
	}

}
