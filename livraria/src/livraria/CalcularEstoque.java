package livraria;

public class CalcularEstoque {

	public static void main(String[] args) {
		/*double livroJava8;
		double livroTDD;
		
		livroJava8 = 59.90;
		livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;*/
		
		double soma = 0;
		/*int contador = 0;
		
		while (contador < 35) {
			double valorDoLivro = 59.90;
			soma = soma + valorDoLivro; //soma += valorLivro
			contador = contador + 1;//contador += 1 ou contador ++
		}*/
		//for (inicializa��o; condi��o; atuaiza��o){}
		
		for (int contador = 0; contador < 35; contador ++) {
			soma += 59.90;
		}
		
		System.out.println("O total em estoque �: " + soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque est� muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque est� muito alto!");
		} else {
			System.out.println("Seu estoque est� bom!");
		}
		
		
		
	}

}
