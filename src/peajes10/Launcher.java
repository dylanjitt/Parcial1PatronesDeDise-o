package peajes10;

public class Launcher {

	public static void main(String[] args) {
		Control c1 = new Control(new Vehiculo("123-XHK", "Lamborghini Murcielago SV"));
		c1.pagar(350);
		
		Control c2 = new Control(new Vehiculo("456-XDR", "BMW X6"));
		c2.pagar(450);
		
		Control c3 = new Control(new Vehiculo("789-MDR", "Mitsubishi Pajero"));
		c3.pagar(150);
		
		Control c4 = new Control(new Vehiculo("147-RGB", "Aston Martin corva"));
		c4.pagar(560);
		
		Control c5 = new Control(new Vehiculo("258-TTH", "Toyota Corolla"));
		c5.pagar(150);
		
		Control c6 = new Control(new Vehiculo("963-BAH", "Volkswagen GOL"));
		c6.pagar(200);

	}

}
