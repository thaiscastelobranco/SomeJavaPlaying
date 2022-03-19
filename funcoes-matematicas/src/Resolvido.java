import java.util.Locale;
import java.util.Scanner;

public class Resolvido {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double valorTerreno = area * valorMetroQuadrado;
		
		System.out.printf("A área do terreno é: %.2f%n", area);
		System.out.printf("O valor do terreno é: %.2f%n", valorTerreno);
		sc.close();

	}

}
