package romanos9;

public class TIX extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.input.startsWith("9")) {
			context.output=context.output+"IX ";
			context.input=context.input.substring(1);
		}
		
	}

}
