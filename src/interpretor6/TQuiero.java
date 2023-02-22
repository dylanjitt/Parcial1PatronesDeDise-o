package interpretor6;

public class TQuiero extends AbstractExpression{
	
	@Override
	public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output=context.output+"When ";
            context.input = context.input.substring(6);
        }
	}

}
