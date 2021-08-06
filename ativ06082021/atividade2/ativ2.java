package atividade2;



public class ativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao avioes[] = new Aviao[3];
		avioes[0] = new Aviao("boeing 707;", "Barcelona", "Lisboa");
		avioes[1] = new Aviao("airbus 380;", "Munich", "Amsterdam");
		avioes[2] = new Aviao("boeing 890;", "Madrid", "Paris");
		
		 for(int i = 0; i < avioes.length; i++) {
			 System.out.println("=======================================");
			 System.out.println(avioes[i].Descricao());
			 System.out.println(avioes[i].Decolagem());
			 System.out.println(avioes[i].Voando());
			 System.out.println(avioes[i].Pouso());

	}
		 }

}
