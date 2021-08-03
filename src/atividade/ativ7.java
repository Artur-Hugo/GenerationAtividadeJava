package atividade;

import java.util.Scanner;

public class ativ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c,d,E,f, x, y;
		
		 Scanner leitor = new Scanner(System.in); 
		
		System.out.println("Escreva os valores de A,B,C,D,E e F\n");
		System.out.println("A: ");
		a = leitor.nextDouble();
		System.out.println("B: ");
		b = leitor.nextDouble();
		System.out.println("C: ");
		c = leitor.nextDouble();
		System.out.println("D: ");
		d = leitor.nextDouble();
		System.out.println("E: ");
		E = leitor.nextDouble();
		System.out.println("F: ");
		f = leitor.nextDouble();
		
		x = (((c*E) - (b*f)) / (a*E)-(b*d));
		y = (((a*f) - (c*d)) / (a*E)-(b*d)) ;
	
				System.out.printf(" Valores: \n %.2f: ", x );
				System.out.printf(	", %.2f: ", y );
				
				leitor.close();
		
	}

}
