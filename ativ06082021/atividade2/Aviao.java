package atividade2;



public class Aviao {

	
	private String modeloDoAviao;
	private String lugarDestino;
	private String lugarPartida;
	
	
	
	
	public String getModeloDoAviao() {
		return modeloDoAviao;
	}

	public void setModeloDoAviao(String modeloDoAviao) {
		this.modeloDoAviao = modeloDoAviao;
	}

	public String getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}

	public String getLugarPartida() {
		return lugarPartida;
	}

	public void setLugarPartida(String lugarPartida) {
		this.lugarPartida = lugarPartida;
	}

	public Aviao(String modeloDoAviao, String lugarDestino, String lugarPartida) {
		
		this.modeloDoAviao = modeloDoAviao;
		this.lugarDestino = lugarDestino;
		this.lugarPartida = lugarPartida;
	}

	public String Descricao() {
		delay(1050);
		return "Modelo de Avião: "+ modeloDoAviao + ", Ponto de Partida: " + lugarPartida + ", Ponto de Destino: "+ lugarDestino ;
	}
	
	public String Decolagem() {
		delay(1000);
		return "Decolando para o destino: " + lugarDestino;
	}
	
	public String Voando() {
		delay(1000);
		return "Sobrevoando";
	}
	
	public String Pouso() {
		delay(2000);
		return "Pousando em " + lugarDestino;
	}
	public static void delay(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
}
