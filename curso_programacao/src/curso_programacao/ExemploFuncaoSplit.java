package curso_programacao;

public class ExemploFuncaoSplit {

	public static void main(String[] args) {
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		/*Este programa pega uma string e divide pelos espaços 
		 colocando cada palavra em um posição num vetor
		 */
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
