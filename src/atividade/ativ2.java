package atividade;

import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int  ano, meses, dia, dias;
		  
		  Scanner leitor = new Scanner(System.in); 
			
		  
		  System.out.println("Digite a idade em dias:\n");
	      dias = leitor.nextInt();
			
		  ano = dias / 365;
		  meses = (dias % 365) / 30;
		  dia = (dias % 365) % 30;
		  
		  System.out.println("A idade em anos, meses e dias é: " + "\nDias: " + dia +"\nMes: " +  meses + "\nAno: " + ano);
		
		  
		  leitor.close();
	}

}
