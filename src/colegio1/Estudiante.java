package colegio1;

public class Estudiante {
	
	private String nombre;
	
	private Cajero cajero;
	
	
	public Estudiante(String nombre, Cajero cajero) {
		login(cajero);
		this.nombre = nombre;
		this.cajero = cajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}
	
	public void login(Cajero cajero) {
		System.out.println("INICIO SESION: ");
		System.out.println(cajero.getCodigo());
		System.out.println("BIENVENIDO: "+cajero.getName());
	}

	public void pagar(int monto) {
		System.out.println("El Estudiante "+nombre+" ha pagado Bs. "+monto);
		PagoSistema.getInstance().Pago(monto);
	}
	
	

}
