import java.util.ArrayList;

public class Client {
    private CalculatorVisitor calculatorVisitor;
    private Token token;

    public Client(CalculatorVisitor calculatorVisitor){
        this.calculatorVisitor = calculatorVisitor;
    }

    public int evaluateExpression(ArrayList<Token> tokenList) {
        for (Token token : tokenList)
        {
            token.accept(calculatorVisitor);
        }
        return calculatorVisitor.getResult();
    }
}
