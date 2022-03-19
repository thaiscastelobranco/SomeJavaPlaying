package application;

import java.util.Scanner;

public class ProgramMatrizResolvido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		//linhas mat.length = n
		for (int i = 0; i < mat.length; i++) {
			//colunas mat[i].length � o tamanho do vetor da linha i
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		//linhas
		for (int i = 0; i < mat.length; i++) {
			//colunas mat[i].length � o tamanho do vetor da linha i
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		sc.close();
	}

}
