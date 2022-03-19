import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracaoJogo;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
		}
		else {
			duracaoJogo = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU: " + duracaoJogo + " HORA(S)");
		sc.close();
	}

}
