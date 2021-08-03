package atividade;

import java.util.Scanner;

public class ativ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   double custoConsumidor, custoFabrica;

	   Scanner leitor = new Scanner(System.in); 
		
	   
	   System.out.println("Escreva o custo de Fabrica do carro: ");
		custoFabrica = leitor.nextDouble();
		custoConsumidor = custoFabrica * 1.28;
	System.out.printf("Custo ao consumidor: %.2f", custoConsumidor);

	
	leitor.close();
	}

}
