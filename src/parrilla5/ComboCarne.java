package parrilla5;

public class ComboCarne implements Icarne {
	
	private String combo;
	private String tipoDeCarne;
	private String saborRefresco;
	private String guarniciones;

	public ComboCarne() {}
	
	public String getCombo() {
		return combo;
	}

	public void setCombo(String combo) {
		this.combo = combo;
	}


	public String getTipoDeCarne() {
		return tipoDeCarne;
	}



	public void setTipoDeCarne(String tipoDeCarne) {
		this.tipoDeCarne = tipoDeCarne;
	}



	public String getSaborRefresco() {
		return saborRefresco;
	}



	public void setSaborRefresco(String saborRefresco) {
		this.saborRefresco = saborRefresco;
	}



	public String getGuarniciones() {
		return guarniciones;
	}



	public void setGuarniciones(String guarniciones) {
		this.guarniciones = guarniciones;
	}


	@Override
	public void showCarne() {
		System.out.println("--------------------------------");
		System.out.println("COMBO: "+combo);
		System.out.println("Tipo de Carne: "+tipoDeCarne);
		System.out.println("Guarnicion: "+guarniciones);
		System.out.println("Refresco: "+saborRefresco);
		
	}

}
