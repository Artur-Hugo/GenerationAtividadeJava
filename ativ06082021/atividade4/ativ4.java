package atividade4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ativ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = " ", cargo;
		Scanner leitor = new Scanner(System.in);
		boolean aux = false;
		
		Funcionario[] func = new Funcionario[3];
		
		
		 for(int i = 0; i < 3; i++) {
			 double sal = 0.00;
			 System.out.println("=======================================");
			 leitor.nextLine();
			 System.out.println("Digite o nome do " +(i+1) +"° funcionario: ");
			 nome = leitor.nextLine();
			 
			 
			 System.out.println("Digite o nome do Cargo: ");
			 cargo = leitor.nextLine();
		
			try {
			 System.out.println("Digite o salario: ");
			 sal = leitor.nextDouble();
			aux = true; 
			}
			 catch (InputMismatchException e) {
			      
			      System.out.println("Erro ao digitar salario");
			      sal = 0.00;
			    }
			 
			func[i] = new Funcionario(nome, cargo, sal); 

	}
	
		 for(int i = 0; i < 3; i++) {
			 System.out.println(func[i]);
		 }
		 	leitor.close();
		 
		
	}

}
