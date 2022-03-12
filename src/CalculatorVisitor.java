import java.nio.charset.MalformedInputException;

public class CalculatorVisitor implements Calculator, Visitor{

    LinkedStack<Token> tokenStack;
    
    public void pushOperand(Operand operand){

    }

    public void performOperation(Operator operator){}

    @Override
    public int getResult() {
        return 0;
    }

    @Override
    public void visit(Operator operator) {

    }

    @Override
    public void visit(Operand operand) {

    }
}
