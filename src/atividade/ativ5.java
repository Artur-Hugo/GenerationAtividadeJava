package atividade;

import java.util.Scanner;

public class ativ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner leitor = new Scanner(System.in); 
		
		double nota1, nota2, nota3, media;

		System.out.println("Digite a nota 1:");
	    nota1  = leitor.nextDouble();
	    System.out.println("Digite a nota 2:");
	    nota2 = leitor.nextDouble();
	    System.out.println("Digite a nota 3:");
	    nota3 = leitor.nextDouble();
	    media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
	    		System.out.println("A média ponderada é " + media);
		

	
	    		leitor.close();
	}

}
