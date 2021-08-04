package atividade04082021;

import java.util.Scanner;

public class ativ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0, idade, pessoaCalma = 0, mulhNerv= 0, homemAgre = 0, outrosCalm = 0, mais40Nerv = 0, menos18calm = 0; 
int sexo, descri; 
		Scanner leitor = new Scanner(System.in);
		while(num != 150) {
			System.out.println("======================Ficha: "+ num + "==================");
			System.out.println("Digite qual a sua idade: ");
			idade = leitor.nextInt();
			
			System.out.println("Digite qual é o seu sexo: (1-feminino / 2-masculino / 3-Outros),");
			sexo = leitor.nextInt();
			
			System.out.println("Digite (1, se a pessoa era calma); (2, se a pessoa era nervosa) e (3, se a pessoa era " + 
					"agressiva).");
			descri = leitor.nextInt();
			num++;
		if(descri == 1)pessoaCalma++;
		if(descri == 2)mulhNerv++;
		if(descri == 3)homemAgre++;
		if(descri == 1 && sexo ==3) outrosCalm++;
		if(descri == 2 && idade > 40) mais40Nerv++;
		if(descri == 1 && idade < 18) menos18calm++;
		}
		System.out.println("o número de pessoas calmas: "+pessoaCalma);
		System.out.println("o número de mulheres nervosas: "+ mulhNerv);
		System.out.println("o número de homens agressivos: "+ homemAgre);
		System.out.println("o número de outros calmos: "+ outrosCalm);
		System.out.println("o número de pessoas nervosas com mais de 40 anos: "+ mais40Nerv);
		System.out.println("o número de pessoas calmas com menos de 18 anos: "+ menos18calm);
		
			leitor.close();
	}

}
