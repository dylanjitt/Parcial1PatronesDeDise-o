package romanos9;

public class TX extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.input.startsWith("10")) {
			context.output=context.output+"X ";
			context.input=context.input.substring(1);
		}
		
	}

}
