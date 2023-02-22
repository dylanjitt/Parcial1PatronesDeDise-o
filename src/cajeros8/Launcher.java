package cajeros8;

public class Launcher {
	
	public static void main(String[] args) {
		Cajero c1 = new Cajero(new Prestamo("Vivienda"));
		Cajero c2 = new Cajero(new Prestamo("negocios"));
		Cajero c3 = new Cajero(new Prestamo("creditos"));
		Cajero c4 = new Cajero(new Prestamo("financiamiento"));
		
		c1.prestamoDinero(2500.00);
		c2.prestamoDinero(3000.00);
		c4.prestamoDinero(4000.00);
		c3.prestamoDinero(1000.00);
		
	}
	

	

}
