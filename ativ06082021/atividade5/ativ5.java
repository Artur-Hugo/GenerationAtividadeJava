package atividade5;

import java.util.Scanner;

public class ativ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete patinete = new Patinete();
		Scanner leitor = new Scanner(System.in);
		String opcao = "";
		System.out.println("Patinete");
		System.out.println("Temos a informaçâo do patinete, deseja saber a informação? \n Então digite sim:");
		
		opcao = leitor.nextLine();
		opcao.toLowerCase();
		if(opcao.equals("sim")) {
			System.out.println("--------------------------------");
			System.out.println("------------_________-----------");
			System.out.println("----------------|---------------");
			System.out.println("----------------|---------------");
			System.out.println("----------------|---------------");
			System.out.println("----------------|---------------");
			System.out.println("----------------|---------------");
			System.out.println("-----___________|---------------");
			System.out.println("-----()---------()---------------");
			System.out.println(patinete);
		}
		leitor.close();
		
	}

}
