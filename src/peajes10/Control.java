package peajes10;

public class Control {
	
	Vehiculo vehiculo;

	public Control(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void pagar (int amount) {
		vehiculo.info();
		System.out.println(">Monto pagado: "+amount+" Bs.");
		Sistema.getInstance().pagar(amount);
	}
	
	

}
