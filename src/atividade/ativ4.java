package atividade;
import java.lang.Math;
import java.util.Scanner;

public class ativ4 {

	public static void main(String[] args) {
		int A, B, C, D, R, S, calculo;
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		System.out.println("(A,B,C)\n");
		System.out.println("Escreva o valor de A: ");
		A = leitor.nextInt();
		System.out.println("Escreva o valor de B: ");
		B = leitor.nextInt();
		System.out.println("Escreva o valor de C: ");	
		C = leitor.nextInt();

		calculo = B + C;
		
		S = (int) Math.pow(calculo,2);
		calculo =(A + B);
		
		R = (int) Math.pow(calculo,2);
		
		
		D = (R + S) / 2;
		
		

		
		System.out.println("Calculo\n");
		System.out.println("Valor de D:" + D + ", Valor de R: " + R + ", Valor de S: " + S);
		
		leitor.close();
	}
	
}
