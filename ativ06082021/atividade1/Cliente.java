package atividade1;

import java.util.Random;

public class Cliente{
	
	private String nome;
	private int idade;
	public Cliente(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}

	public String Descricao() {
		delay(1050);
		return "Nome: "+ nome + "Idade: " + idade ;
	}
	
	public String Olhar() {
		delay(1000);
		return "Olhando as Prateleiras";
	}
	
	public String AcaoDeCompraOuNao()  {
		delay(2000);
		 Random r = new Random();
		int num = r.nextInt(2);
		if(num == 0) {return "Não está Comprando";
		}else {return "Está Comprando";}
	}
	
	public String IrEmbora() {
		delay(2000);
		return nome + " Está Indo Embora.";
	}
	public static void delay(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	
	
	
}
