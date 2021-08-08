package atividade6;

public class ContaBancaria {

	private double saldo;
	private double sacar;
	
	
	
	
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSacar() {
		return this.sacar;
	}
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	
	public double Sacarvalor(double sacar) {
		this.saldo = saldo - sacar; 
		
		
		return saldo;
	}
	


}
