import java.nio.charset.MalformedInputException;

public class CalculatorVisitor implements Calculator, Visitor{

    LinkedStack<Token> tokenStack;
    
    private void pushOperand(Operand operand){
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator){
      Operand firstOperand = (Operand) tokenStack.pop();
      Operand secondOperand = (Operand) tokenStack.pop();
      int firstValue = firstOperand.getValue();
      int secondValue = secondOperand.getValue();
      int result = 0;
      switch (operator.getOperation()){
          case PLUS: result = firstValue + secondValue;
          break;
          case MINUS: result = secondValue - firstValue;
          break;
          case DIVISION: result = secondValue / firstValue;
          break;
          case MULTIPLICATION: result = firstValue * secondValue;
          break;
      }
      Operand operand = new Operand(this, result);
      tokenStack.push(operand);
    }

    @Override
    public int getResult() {
        Operand operand = (Operand) tokenStack.pop();
        return operand.getValue();
    }

    @Override
    public void visit(Operator operator) {
        performOperation(operator);
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }
}
