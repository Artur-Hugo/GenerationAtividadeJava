package Animais;

public class Cachorro extends Animais {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String EmitirSom() {
		// TODO Auto-generated method stub
		return "au au";
	}
	
	@Override
	public String Movimentacao() {
		// TODO Auto-generated method stub
	 return "Correr";
	}
	
}
