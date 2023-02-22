package kitEscolar3;

public class Computadora {
	private String marca;
	private String os;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public void infoCompu() {
		System.out.println("COMPUTADORA: ");
		System.out.println("Marca: "+marca);
		System.out.println("Sistema operativo: "+os);
	}

}
