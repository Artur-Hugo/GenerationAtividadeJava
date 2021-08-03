package atividade03082021;

import java.util.Scanner;

public class ativ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Escreva a idade de uma pessoa: ");
		 idade = leitor.nextInt();
		if(idade >= 10 && idade <= 14 ) {
		
				System.out.println("Infantil ");} else
					if(idade >= 15 && idade <= 17) {
						System.out.println("Juvenil ");
					}
					else
						if(idade >= 18 && idade <= 25) {
							System.out.println("Adulto ");
						}else {
							System.out.println("Outros ");
						}
	
	
			leitor.close();
	}


}