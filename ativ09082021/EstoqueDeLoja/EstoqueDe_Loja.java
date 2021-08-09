package EstoqueDeLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EstoqueDe_Loja {
	  public static void main(String[] args) {
		  List<Produtos> produtos = new ArrayList<Produtos>();
		Produtos[] produto = new Produtos[10];
	
		Scanner leitor = new Scanner(System.in);
		
		 produto[1] = new Produtos("Vinagre Galo", "123454", 8.00);
		 
		 produto[2] = new Produtos("Ketchup Quero", "435678",5.00);
		 produto[3] = new Produtos("Bolacha Trakinas", "023422", 2.99);
		 produto[4] = new Produtos("Refrigerante Pepsi", "098732", 3.99);
	
		 
		 for(int i = 1;  i < produto.length; i++) {
			 produtos.add(produto[i]);
		 }
	
		    for(int i = 0 ; i < produtos.size(); i++){
               System.out.println("id "+i +" ," + produtos.get(i));
         }
		   int n = -99; 
		 while(n != 6) {
			 System.out.println("Digite 1 para adicionar produtos");
			 System.out.println("Digite 2 para Apresentar");
			 System.out.println("Digite 3 para Remover");
			 System.out.println("Digite 4 para atualizar");
			 System.out.println("Digite 6 para sair");
			 n = leitor.nextInt();
			 String nome, codigo;
			 double preco;
			 switch (n) {
			 
			 case 1 :
				 leitor.nextLine();
				 System.out.println("Digite o nome do Produto: ");
				 nome = leitor.nextLine();
				 
				 System.out.println("Digite o codigo do produto: ");
				 codigo = leitor.nextLine();
				 
				 System.out.println("Digite o preço do produto: ");
				 preco = leitor.nextDouble();
				 
				 Produtos produto1 = new Produtos(nome, codigo, preco);
				 
				 produtos.add(produto1);
				 
				 break;
				 
			 case 2:
				 for(int i = 0 ; i < produtos.size(); i++){
		               System.out.println( "id "+i +" ," + produtos.get(i));
		         }
				 
				 break;
			 case 3:
				 System.out.println("Selecione o id que quer remover:");
				 n = leitor.nextInt();
				 produtos.remove(n);
				 
				 break;
				
			 case 4:
				 System.out.println("Digite o id e o produto para atualizar:");
				 System.out.println("Selecione o id que quer atualizar:");
				 n = leitor.nextInt();
				 leitor.nextLine();
				 System.out.println("Digite o nome do Produto: ");
				 nome = leitor.nextLine();
				 
				 System.out.println("Digite o codigo do produto: ");
				 codigo = leitor.nextLine();
				 
				 System.out.println("Digite o preço do produto: ");
				 preco = leitor.nextDouble();
				 
				  produto1 = new Produtos(nome, codigo, preco);
				  produtos.set(n, produto1);
				 break;
			 }
			 
			
			 
		 }  
		 leitor.close();
}
}