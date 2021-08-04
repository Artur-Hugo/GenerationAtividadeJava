package atividade04082021;

import java.util.Scanner;

public class ativ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int media3= 0, num = 0, cont=0;
		Scanner leitor = new Scanner(System.in);
		
	do {
		System.out.println("Digite o numero: ");
		num = leitor.nextInt();
		if(num != 0 && num % 2 != 0) media3 = media3 + num;
		cont++;
	}while(num != 0);
	media3 = media3 / cont;
	System.out.println("Média dos numeros multiplos por 3: "+media3);

	leitor.close();
	}

}
