package atividade3;


public class ativ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoEletronico produtos[] = new ProdutoEletronico[3];
		produtos[0] = new ProdutoEletronico("Mouse Laser","2412412", 20.00);
		produtos[1] = new ProdutoEletronico("Teclado PPP","1354312", 22.00);
		produtos[2] = new ProdutoEletronico("Relogio Digital","9876565", 25.00);
		
		 for(int i = 0; i < produtos.length; i++) {
			 System.out.println("=======================================");
			 System.out.println(produtos[i]);
			;

	}
	}

}
