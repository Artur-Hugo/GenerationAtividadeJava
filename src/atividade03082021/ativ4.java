package atividade03082021;

import java.util.Scanner;

public class ativ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4

		int num, raiz;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Escreva um numero: ");
		 num = leitor.nextInt();
		 
		 if(num % 2 == 0) {
			 System.out.println("Esse numero: "+ num + " é par");
			 raiz = (int) Math.sqrt(num);
			 System.out.println("E sua raiz quadrada é "+ raiz );
			}
		 else {
			 System.out.println("Esse numero: "+ num + " é impar");
			 raiz = (int) Math.pow(num,2);
			 System.out.println("E seu calculo elevado ao quadrado é "+ raiz );
			 
		 }
		 leitor.close();
	}

}
