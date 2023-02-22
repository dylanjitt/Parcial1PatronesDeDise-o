package peajes10;

public class Sistema {
	
	private static Sistema instance = null;
	private int saldo;
	
	public Sistema() {
		saldo=0;
		System.out.println("Saldo inicial: "+saldo+" Bs.");
	}
	
	private synchronized static void create(){
        if (instance == null)
            instance = new Sistema();
    }

    public static Sistema getInstance(){
        if (instance == null)
            create();
        return instance;
    }
    
    public synchronized void pagar(int amount) {
    	saldo = saldo+amount;
    	saldoActual();
    }
    
    public void saldoActual(){
        System.out.println(" >Saldo actual: "+saldo+" Bs.");
    }
    
    

}
