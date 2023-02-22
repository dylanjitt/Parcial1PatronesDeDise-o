package cajeros8;

public class CuentaMain {
	
	private static CuentaMain instance = null;
	private double saldo;
	
	public CuentaMain() {
		saldo = 10000.00;
		System.out.println("> SALDO INICIAL: "+saldo+" Bs");
	}
	
	private synchronized static void create(){
        if (instance == null)
            instance = new CuentaMain();
    }

    public static CuentaMain getInstance(){
        if (instance == null)
            create();
        return instance;
    }
    
    public synchronized void retiroDinero(double amount){
        if (amount <= saldo){
            saldo=saldo-amount;
            System.out.println("> Se retiraron  "+amount+" Bs exitosamente.");
            saldoActual();
        }else{
            System.out.println("> ERROR, no se pudo retirar la cantidad solicitada: "+amount+", es mayor al saldo actual: "+saldo);
        }
    }

    public void saldoActual(){
        System.out.println(" > SALDO ACTUAL : "+saldo);
    }
	
	

}
