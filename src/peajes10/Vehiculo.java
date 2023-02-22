package peajes10;

public class Vehiculo {
	
	private String placa;
	private String modelo;
	
	public Vehiculo(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void info() {
		System.out.println("-----------------------------");
		System.out.println("AUTOMOVIL:");
		System.out.println("Placa: "+placa);
		System.out.println("Modelo: "+modelo);
	}
	
	

}
