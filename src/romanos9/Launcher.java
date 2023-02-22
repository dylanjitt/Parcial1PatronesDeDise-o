package romanos9;

public class Launcher {

	public static void main(String[] args) {
		String msg = "1 2 3 4 5 6 7 8 9 10";
		
		NonTerminalExpression nte = new NonTerminalExpression(msg);
		String msgOut = nte.outputMessage();
		System.out.println(msg);
		System.out.println(msgOut);

	}

}
