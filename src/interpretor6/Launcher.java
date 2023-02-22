package interpretor6;

public class Launcher {

	public static void main(String[] args) {
		String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
		
		NonTerminalExpression nte = new NonTerminalExpression(msg);
		String output = nte.outputMessage();
		System.out.println(msg);
		System.out.println(output);

	}

}
