package atividade;

import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in); 
		
		  int  anos, meses, dias, diasconcatenados;
		  
	      System.out.println("Digite a idade em anos:\n");
	      anos = leitor.nextInt();
	      
	      System.out.println("Digite a idade em meses:\n");
	      meses = leitor.nextInt();
	      
	      System.out.println("Digite a idade em dias:\n");
	      dias = leitor.nextInt();
	      

		  anos = anos * 365;
		  meses = (meses * 30);
		 
		  diasconcatenados = anos + meses + dias;
		  
		  System.out.println("A idade em dias é: " + "\nDias: " + diasconcatenados);

		  leitor.close();
	
	}

}
