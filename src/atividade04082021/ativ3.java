package atividade04082021;

import java.util.Scanner;

public class ativ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade21 = 0, idademais50 = 0, idade = 0;
		Scanner leitor = new Scanner(System.in);
		while(idade != -99) {
			System.out.println("Digite a sua idade");
			idade = leitor.nextInt();
			
			if(idade < 21) idade21++;
			if(idade > 50)idademais50++;
			
		}
		System.out.println("numero de pessoas com idade menor que 21: "+ idade21);
		System.out.println("numero de pessoas com idade maior que 50: "+ idademais50);

		leitor.close();
	}

	
}
