package kitEscolar3;

public class Mochila {
	
	private int numBolsillos;
	private int tamaño;
	
	public int getNumBolsillos() {
		return numBolsillos;
	}
	public void setNumBolsillos(int numBolsillos) {
		this.numBolsillos = numBolsillos;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public void infoMochila() {
		System.out.println("MOCHILA:");
		System.out.println("Nro. Bolsillos: "+numBolsillos);
		System.out.println("Tamaño: "+tamaño+" cm.");
	}

}
