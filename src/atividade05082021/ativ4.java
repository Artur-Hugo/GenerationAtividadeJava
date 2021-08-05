package atividade05082021;

import java.util.Scanner;

public class ativ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][3];
				int soma = 0, somadiagonal=0;
				Scanner leitor = new Scanner(System.in);
				
				System.out.println("Escreva os valores:\n ");
				for(int l = 0; l < 3; l++){
					for(int c = 0; c < 3; c++){
						System.out.print("Linha " + (l+1) +",  Coluna " + (c+1)+ ": ");
						matriz[l][c] = leitor.nextInt();
						soma = soma + matriz[l][c];
					
							somadiagonal = matriz[2][0] + matriz[1][1] + matriz[0][2];
							
						
						
						}
					System.out.println("\n");
					}
					for(int l = 0; l < 3; l++){
					for(int c = 0; c < 3; c++){
						System.out.print(matriz[l][c] + ", ");
					}
					System.out.print("\n");
				}
					System.out.println("Soma dos valores: "+ soma);
					System.out.println("\nSoma dos valores da diagonal principal: "+ somadiagonal);
					leitor.close();

				

	}

}
