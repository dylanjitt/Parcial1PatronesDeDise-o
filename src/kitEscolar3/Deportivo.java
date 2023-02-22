package kitEscolar3;

public class Deportivo {
	private int talla;
	private String color;
	private int nroPrendas;
	
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNroPrendas() {
		return nroPrendas;
	}
	public void setNroPrendas(int nroPrendas) {
		this.nroPrendas = nroPrendas;
	}
	
	public void infoDeportivo() {
		System.out.println("DEPORTIVO:");
		System.out.println("Talla: "+talla);
		System.out.println("Color: "+color);
		System.out.println(nroPrendas+" prendas");
	}

}
