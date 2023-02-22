package kitEscolar3;

public class Cuaderno {
	private String tipo;
	private int hojas;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getHojas() {
		return hojas;
	}
	public void setHojas(int hojas) {
		this.hojas = hojas;
	}
	
	public void infoCuaderno() {
		System.out.println("CUADERNO:");
		System.out.println("Tipo: "+tipo);
		System.out.println("Nro. Hojas: "+hojas);
	}

}
