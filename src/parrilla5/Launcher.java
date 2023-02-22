package parrilla5;

public class Launcher {

	public static void main(String[] args) {

		ComboCarne bife =  new BifeCreator().create();
		ComboCarne lomito = new LomitoCreator().create();
		ComboCarne tira = new TiraCreator().create();
		
		bife.showCarne();
		lomito.showCarne();
		tira.showCarne();
		

	}

}
