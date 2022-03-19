package br.com.thais;

import java.util.Scanner;

public class ClubeDeTenis {
	public static void main(String[] args) {
		/* Categorias:
		 De 5 a 10 anos – Infantil;
		 De 11 a 15 anos – Juvenil;
		 De 16 a 20 anos – Júnior;
		 De 21 a 25 anos – Profissional
		 Solicitar a idade e imprimir a cateoria.
		 */
		System.out.println("Qual é a sua idade?");
		Scanner teclado = new Scanner(System.in);
		int idade = teclado.nextInt();
		if(idade >= 5 && idade <= 10) {
			System.out.println("Infantil");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println("Juvenil");
		} else if (idade >= 16 && idade <=20) {
			System.out.println("Júnior");
		} else if (idade >= 21) {
			System.out.println("Profissional");
		}
	}
}
