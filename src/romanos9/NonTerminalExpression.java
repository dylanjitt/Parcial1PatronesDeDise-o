package romanos9;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends AbstractExpression{
	
	
	private List<AbstractExpression> grammar = new ArrayList<>();
	private Context context;
	
	public NonTerminalExpression(String input) {
		context = new Context(input.replace(" ",""));
		for(String charInput : input.split(" ")) {
			switch (charInput) {
			case "1": {
				
				grammar.add(new TI());
				break;
			}
			case "2": {
				
				grammar.add(new TII());
				break;
			}
			case "3": {
				
				grammar.add(new TIII());
				break;
			}
			case "4": {
				
				grammar.add(new TIV());
				break;
			}
			case "5": {
				
				grammar.add(new TV());
				break;
			}
			case "6": {
				
				grammar.add(new TVI());
				break;
			}
			case "7": {
				
				grammar.add(new TVII());
				break;
			}
			case "8": {
				
				grammar.add(new TVIII());
				break;
			}
			case "9": {
				
				grammar.add(new TIX());
				break;
			}
			case "10": {
				
				grammar.add(new TX());
				break;
			}
			default:
				
				break;
			}
		}
	
	}
	
    public String outputMessage(){
        for (AbstractExpression expression:grammar){
            expression.interpreter(context);
        }
        return context.output;
    }
	
	
	

	@Override
	public void interpreter(Context context) {}

}
