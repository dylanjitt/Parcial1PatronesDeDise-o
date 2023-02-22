package kitEscolar3;

public class KitColegialCreator extends CreatorKit{

	@Override
	public KitColegial create() {

		KitColegial escolar = new KitColegial();
		
		Mochila mochila = new Mochila();
		mochila.setNumBolsillos(5);
		mochila.setTamaño(65);
		
		Libro libro = new Libro();
		libro.setTitulo("Luna de Pluton");
		libro.setTipo("Ficcion");
		libro.setAutor("Dross");
		
		Computadora compu = new Computadora();
		compu.setMarca("Apple Macbook");
		compu.setOs("Mac OS");
		
		escolar.setMochila(mochila);
		escolar.setLibro(libro);
		escolar.setCompu(compu);
		
		return escolar;
	}

}
