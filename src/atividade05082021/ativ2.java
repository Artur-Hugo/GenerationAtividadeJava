package atividade05082021;
import java.util.*;
public class ativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  mediaarit=0, maiorvalor=0, ocorrencia=0;
		double cont=0;
		int vetor[] = new int[9];
		Random gerador = new Random(1);
		System.out.println("lançamento: ");	
		for(int i=0; i < vetor.length; i++){
			vetor[i] = 1 + gerador.nextInt(6);
		}			
				for(int i=0; i < vetor.length; i++){
					System.out.println("\nLançamento: " + (i+1)+"º  "+ vetor[i]);
					mediaarit += vetor[i];
					cont++;
					if( vetor[i] > maiorvalor ){

					maiorvalor = vetor[i];

					ocorrencia++;}

				
					
					}
				System.out.println("\nMédia de lançamento: " + (mediaarit / cont));
				System.out.println("\nMaiorValor: " + maiorvalor + ", Quantas vezes se ocorreu de ter inserido o maior valor ao decorrer do programa: "+ ocorrencia);
				
	}

}
