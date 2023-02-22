package parrilla5;

public class LomitoCreator extends CreatorCarne {

	@Override
	public ComboCarne create() {
		
		ComboCarne carne = new ComboCarne();
		carne.setCombo("LOMITO");
		carne.setTipoDeCarne("Lomo");
		carne.setGuarniciones("Arroz");
		carne.setSaborRefresco("Pepsi");
		
		return carne;
	}

}
