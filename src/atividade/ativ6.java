package atividade;
import java.lang.Math;

import java.util.Scanner;

public class ativ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leitor = new Scanner(System.in); 
		double  x2, x1, y2, y1,  p2;
		double d, p1;
		System.out.println(" Calculo das Distâncias entre os pontos P(x1,y1) e P(x2,y2)\n");
		System.out.println("Digite o valor do x1:\n");
			x1  = leitor.nextDouble();
			System.out.println("Digite o valor do x2:\n");
			x2 = leitor.nextDouble();
			System.out.println("Digite o valor do y1:\n");
			y1  = leitor.nextDouble();
			System.out.println("Digite o valor do y2:\n");
			y2  = leitor.nextDouble();
			p1 = Math.pow(((x2-x1)), 2.0);
			p2 = Math.pow((y2-y1), 2.0); 
			d = Math.sqrt((p1 + p2)); 
			System.out.printf("O calculo é %.2f" , d );

			
			
			leitor.close();
	}

	
}
