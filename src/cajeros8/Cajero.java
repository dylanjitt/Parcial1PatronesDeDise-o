package cajeros8;

public class Cajero {
	Prestamo prestamo;

	public Cajero(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	
	public void prestamoDinero(double monto) {
		System.out.println("Se realizo el prestamo de Tipo "+prestamo.getTipo()+" por el monto de: "+monto+" Bs");
		CuentaMain.getInstance().retiroDinero(monto);
	}
	
	

}
