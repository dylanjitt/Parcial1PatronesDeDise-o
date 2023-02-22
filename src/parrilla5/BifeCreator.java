package parrilla5;

public class BifeCreator extends CreatorCarne {

	@Override
	public ComboCarne create() {
		
		ComboCarne carne = new ComboCarne();
		carne.setCombo("BIFE");
		carne.setTipoDeCarne("Bife Chorizo");
		carne.setGuarniciones("Papas Fritas");
		carne.setSaborRefresco("Coca Cola");
		
		return carne;
	}

}
