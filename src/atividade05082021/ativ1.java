package atividade05082021;

import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pontuacao[] = new double[5], maior = 0;
				int contador = 0;
				
				Scanner leitor = new Scanner(System.in);

				System.out.println("Digite os 5 valores:");
				for(contador = 0; contador < pontuacao.length; contador++){
					pontuacao[contador] = leitor.nextInt();
					
					if(pontuacao[contador] > maior){
							maior = pontuacao[contador];
						
						}
					}
				
				
				/*for(int i = 0; i < pontuacao.length; i++) {
					System.out.println(pontuacao[i]);
					
				}*/

					System.out.println("O maior valor é "+ maior);
					leitor.close();
	}
}
