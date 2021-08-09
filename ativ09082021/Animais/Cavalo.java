package Animais;

public class Cavalo extends Animais{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String EmitirSom() {
		// TODO Auto-generated method stub
		return "Rincha!!!";
	}
	
	@Override
	public String Movimentacao() {
		// TODO Auto-generated method stub
		return "Corre";
	}

}
