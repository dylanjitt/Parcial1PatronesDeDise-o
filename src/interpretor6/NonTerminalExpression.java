package interpretor6;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends AbstractExpression {
	
	private List<AbstractExpression> grammar = new ArrayList<>();
	private Context context;
	
	public NonTerminalExpression (String input){
        context = new Context(input.replace(" ",""));//como a quiero b Para c ->ComoaQuierobParac
        for (String charInput :input.split(" ")){//[como,a,quiero,b,para,c]
            switch (charInput){
                case "Como":
                    grammar.add(new TComo());
                    break;
                case "Quiero":
                    grammar.add(new TQuiero());
                    break;
                case "Para":
                    grammar.add(new TPara());
                    break;
                default:
                	grammar.add(new TDefault(charInput));
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
    public void interpreter(Context context) {

    }

}
