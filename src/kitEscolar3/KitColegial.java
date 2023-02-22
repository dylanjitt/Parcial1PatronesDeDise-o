package kitEscolar3;

public class KitColegial implements Ikit {
	private Mochila mochila;
	private Libro libro;
	private Computadora compu;
	
	public KitColegial() {}

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Computadora getCompu() {
		return compu;
	}

	public void setCompu(Computadora compu) {
		this.compu = compu;
	}

	@Override
	public void showInfo() {
		System.out.println("KIT COLEGIAL");
		System.out.println(" ");
		mochila.infoMochila();
		libro.infoLibro();
		compu.infoCompu();
		System.out.println("-------------------");
		
	}
	
	

}
