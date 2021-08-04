package atividade04082021;

import java.util.Scanner;

public class ativ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int soma= 0, num = 0;
			Scanner leitor = new Scanner(System.in);
		do {
			System.out.println("Digite o numero: ");
			num = leitor.nextInt();
			soma = soma + num;
		}while(num != 0);
		
		System.out.println("Soma dos números digitados: "+soma);
	
		leitor.close();
	}

}
