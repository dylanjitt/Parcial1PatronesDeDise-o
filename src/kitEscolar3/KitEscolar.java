package kitEscolar3;

public class KitEscolar implements Ikit{
	
	private Mochila mochila;
	private Deportivo deportivo;
	private Cuaderno cuaderno;
	
	public KitEscolar() {}

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Deportivo getDeportivo() {
		return deportivo;
	}

	public void setDeportivo(Deportivo deportivo) {
		this.deportivo = deportivo;
	}

	public Cuaderno getCuaderno() {
		return cuaderno;
	}

	public void setCuaderno(Cuaderno cuaderno) {
		this.cuaderno = cuaderno;
	}

	@Override
	public void showInfo() {
		System.out.println("KIT ESCOLAR");
		System.out.println(" ");
		mochila.infoMochila();
		deportivo.infoDeportivo();
		cuaderno.infoCuaderno();
		System.out.println("-------------------");
		
	}
	
	
	
	

}
