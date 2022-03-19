import java.util.Locale;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto;
		
		preco = sc.nextDouble();

		desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();
	}

}
