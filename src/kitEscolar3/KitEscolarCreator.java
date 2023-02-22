package kitEscolar3;

public class KitEscolarCreator extends CreatorKit{

	@Override
	public KitEscolar create() {

		KitEscolar escolar = new KitEscolar();
		
		Mochila mochila = new Mochila();
		mochila.setNumBolsillos(5);
		mochila.setTamaño(65);
		
		Deportivo deportivo = new Deportivo();
		deportivo.setTalla(42);
		deportivo.setColor("Azul");
		deportivo.setNroPrendas(3);
		
		Cuaderno cuaderno = new Cuaderno();
		cuaderno.setTipo("Anillado");
		cuaderno.setHojas(100);
		
		escolar.setCuaderno(cuaderno);
		escolar.setDeportivo(deportivo);
		escolar.setMochila(mochila);
		
		
		
		return escolar;
	}
	

}
