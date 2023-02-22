package interpretor6;

public class TDefault extends AbstractExpression{
	
	private String word;
	
	public TDefault(String word) {
		this.word = word;
	}

	@Override
	public void interpreter(Context context) {
		
        //if (context.input.startsWith("Quiero")){
            context.output=context.output+word+" ";
            context.input = context.input.substring(word.length());
        //}
	}

}
