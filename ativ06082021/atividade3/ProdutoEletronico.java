package atividade3;

public class ProdutoEletronico {

	private String nomeProduto;
	private String codigoBarra;
	private double preco;
	public ProdutoEletronico(String nomeProduto, String codigoBarra, double preco) {
		this.preco = preco;
		this.nomeProduto = nomeProduto;
		this.codigoBarra = codigoBarra;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do produto: "+ nomeProduto + ", Codigo: " + codigoBarra + ", Preço: " + preco ;
	}
	
	
	
}
