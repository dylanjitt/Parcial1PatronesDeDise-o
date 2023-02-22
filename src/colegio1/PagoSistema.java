package colegio1;

public class PagoSistema {
	
	private static PagoSistema instance = null;
	private int saldo;
	
	public PagoSistema() {
		saldo=0 ;
		System.out.println(">Saldo Inicial: "+saldo);
	}
	
	private synchronized static void create(){
        if (instance == null)
            instance = new PagoSistema();
    }

    
    public static PagoSistema getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void Pago(int amount){
        saldo=saldo+amount;
        saldoActual();
    }

    public void saldoActual(){
        System.out.println("> Saldo actual: "+saldo);
        System.out.println("-----------------------------");
    }
	
	

}
