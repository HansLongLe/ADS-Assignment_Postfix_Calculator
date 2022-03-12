import java.util.ArrayList;

public class Client {
    private CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
    private Token token;

    public int evaluateExpression(ArrayList<Token> tokenList) {
        for (Token token : tokenList)
        {
            token.accept(calculatorVisitor);
        }
        return calculatorVisitor.getResult();
    }
}
