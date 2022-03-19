package br.com.thais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImprimirIdadesAteDoze {
	public static void main(String[] args) {
		/*Receber a idade de 10 pessoas e escrever a quantidade
		de pessoas com idade entre 0 e 12 anos*/
		System.out.println("Digite sua idade");
		Scanner teclado = new Scanner(System.in);
		
		List<Integer> listaDeIdades = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int idade = teclado.nextInt();
			if (idade <= 12) {
				listaDeIdades.add(idade);
			}
		} 
		System.out.println(listaDeIdades.size());
	}

}
