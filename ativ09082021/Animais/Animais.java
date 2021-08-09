package Animais;

public class Animais {

	private String nome;
	private int idade;
	
	
	
	public Animais(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public Animais() {
		// TODO Auto-generated constructor stub
	}

	public String EmitirSom(){
		return null;
	}
	
	public String Movimentacao() {
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+ nome + ", idade: " + idade + ", emite o som de: "+ EmitirSom() + ",ele se: " + Movimentacao()   ;
	}
	
}
