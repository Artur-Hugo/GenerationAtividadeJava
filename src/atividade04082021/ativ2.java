package atividade04082021;

import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contpar= 0, num = 0, contimpar=0;
		Scanner leitor = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o numero 1º: ");
			num = leitor.nextInt();
			if(num % 2 == 0) {contpar++;}
			else {contimpar++;}
			
		}
		System.out.println("Quantidade de numeros par: "+contpar);
		System.out.println("Quantidade de numeros impar: "+contimpar);
		leitor.close();
	}

}
