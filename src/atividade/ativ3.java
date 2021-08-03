package atividade;

import java.util.Scanner;

public class ativ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		  
		  Scanner leitor = new Scanner(System.in); 
		  
			int horas, minutos, segundos, tempoEmSegundos;
			System.out.println("Digite a duração do evento em segundos\n");
			tempoEmSegundos = leitor.nextInt() ;
			horas = (tempoEmSegundos / 3600);
			minutos = (tempoEmSegundos % 3600)/60;
			segundos = ((tempoEmSegundos % 3600) % 60);
					System.out.print("A duração do evento foi de " + horas +" horas, "+ minutos +" minutos e "+ segundos +" segundos");
	     
	      leitor.close();
		  
		  
	    //  System.out.println("A duração do evento foi de: "+ "\nHoras: " + horas + "\nMinutos: ",minutos,"\nSeg: ", seg)

	}

}
