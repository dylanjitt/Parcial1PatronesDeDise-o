package parrilla5;

public class TiraCreator extends CreatorCarne {

	@Override
	public ComboCarne create() {
		
		ComboCarne carne = new ComboCarne();
		carne.setCombo("TIRA");
		carne.setTipoDeCarne("Tira de Res");
		carne.setGuarniciones("Fideo");
		carne.setSaborRefresco("Coca Cola");
		
		return carne;
	}

}
