package atividade6;

import java.util.Random;
import java.util.Scanner;

public class ativ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		ContaBancaria contabancaria = new ContaBancaria();
		
		Random r = new Random();
		int saldoi = r.nextInt(2000);
		double saldo = (int) saldoi;  
		contabancaria.setSaldo(saldo);
		int n= 0;
		System.out.println("Saldo na conta bancaria: " + contabancaria.getSaldo());
		
		while(n != 1 && n !=2 ) {
		System.out.println("Deseja fazer o saque? digite 1 para sim e 2 para não");
		n = leitor.nextInt();
		
		if(n == 1) {
			System.out.println("Saldo na conta bancaria: " + contabancaria.getSaldo());
			double saque;
			System.out.println("Digite o valor do saque: ");
			saque = leitor.nextDouble();
			if(saque > contabancaria.getSaldo()) {
				System.out.println("Saque invalido");
			}
			else {
				contabancaria.Sacarvalor(saque);
				System.out.println("Saldo na conta bancaria: " + contabancaria.getSaldo());
			}
		}
		else {
			System.out.println("Finalizado!!");
		}
		
		break;
		}
		
		leitor.close();
		
		
	}

}
