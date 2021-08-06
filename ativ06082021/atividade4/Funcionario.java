package atividade4;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	public Funcionario(String nome, String cargo, double salario) {
		
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", Cargo: " + cargo + ", Salario: "+salario;
	}
	
	
}
