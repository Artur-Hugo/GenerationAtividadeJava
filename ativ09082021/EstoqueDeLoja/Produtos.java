package EstoqueDeLoja;

public class Produtos {

	private String nome;
	private String codigo;
	private double preco;
	public Produtos(String nome, String codigo, double preco) {
		
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", codigo: " + codigo + ", preço: "+ preco ;
	}
	
	
}
