package atividade1;

public class ativ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente clientes[] = new Cliente[3];
		
		 clientes[0] = new Cliente("Sartunino", 32);
		 clientes[1] = new Cliente("Ana Belgaris", 29);
		 clientes[2] = new Cliente("Edignaldo", 52);
		
		 for(int i = 0; i < clientes.length; i++) {
			 System.out.println("=======================================");
		System.out.println(clientes[i].Descricao());
		System.out.println(clientes[i].Olhar());
		System.out.println(clientes[i].AcaoDeCompraOuNao());
		System.out.println(clientes[i].IrEmbora());
		
		 }
		
		
		
	}

}
