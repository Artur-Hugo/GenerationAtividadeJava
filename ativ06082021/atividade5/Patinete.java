package atividade5;



public class Patinete {

	private String nome = "Patinete";
	private double velocidade = 10;
	public Patinete(String nome, int v) {
		
		this.nome = nome;
		this.velocidade = v;
	}
	Patinete(){}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A minha " + nome + "Pode chegar a " + velocidade + "Km/h";
	}
	

	
	
	
}
