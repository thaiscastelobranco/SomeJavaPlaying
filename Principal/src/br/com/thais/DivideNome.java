package br.com.thais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivideNome {

	public static void main(String[] args) {
		System.out.println("Qual é o seu nome completo?");
		
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		String[] partirNome = nome.split(" ");
		System.out.println(partirNome[0] + " " + partirNome[partirNome.length-1]);
	}

}
