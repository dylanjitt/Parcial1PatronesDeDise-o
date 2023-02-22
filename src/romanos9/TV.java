package romanos9;

public class TV extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.input.startsWith("5")) {
			context.output=context.output+"V ";
			context.input=context.input.substring(1);
		}
		
	}

}
