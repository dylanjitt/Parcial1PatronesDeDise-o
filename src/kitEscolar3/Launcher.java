package kitEscolar3;

public class Launcher {

	public static void main(String[] args) {
		KitEscolar escolar = new KitEscolarCreator().create();
		KitColegial colegial = new KitColegialCreator().create();
		
		escolar.showInfo();
		colegial.showInfo();

	}

}
