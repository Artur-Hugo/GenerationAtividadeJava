package atividade03082021;

import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor[] = new int[4], maiorValor = 0;
		System.out.println("Escreva os tr�s numeros: ");
		Scanner leitor = new Scanner(System.in);
		for(int i = 0; i <= 2; i++) {
			valor[i] = leitor.nextInt();
			if(maiorValor < valor[i]) {
				maiorValor = valor[i];
			}
			
			
		}
		System.out.println("O maior valor �: " + maiorValor);
		
			leitor.close();
	}

}
