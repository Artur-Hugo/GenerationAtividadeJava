package atividade03082021;

import java.util.Arrays;
import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor[] = new int[4], maiorValor = 0, maiorValor1[] = new int[3];
		System.out.println("Escreva os três numeros: ");
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i <= 2; i++ ) {
			valor[i] = leitor.nextInt();
			
			if(maiorValor < valor[i]) {
				for(int l = 0; l <= 2; l++ ) {
				maiorValor1[l] = valor[l];}
			}
			
		}
		
		Arrays.sort(maiorValor1);
		for(int l = 0; l <= 2; l++ ) {
			System.out.println("Valores: "+ maiorValor1[l]);}
	
		
		leitor.close();
	}

}
