package interpretor6;

public class TPara extends AbstractExpression {
	
	@Override
	public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output=context.output+"Then ";
            context.input = context.input.substring(4);
        }
	}

}
