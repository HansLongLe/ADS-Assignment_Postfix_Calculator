import java.nio.charset.MalformedInputException;

public class CalculatorVisitor implements Calculator, Visitor{

    LinkedStack<Token> tokenStack = new LinkedStack<>();
    
    private void pushOperand(Operand operand){
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator) throws MalformedExpressionException
    {
      Operand firstOperand = (Operand) tokenStack.pop();
      Operand secondOperand = (Operand) tokenStack.pop();
      if (firstOperand != null || secondOperand != null) {
          int firstValue = firstOperand.getValue();
          int secondValue = secondOperand.getValue();
          int result = 0;
          switch (operator.getOperation()) {
              case PLUS:
                  result = firstValue + secondValue;
                  break;
              case MINUS:
                  result = firstValue - secondValue;
                  break;
              case DIVISION:
                  result = firstValue / secondValue;
                  break;
              case MULTIPLICATION:
                  result = firstValue * secondValue;
                  break;
          }
          Operand operand = new Operand(this, result);
          tokenStack.push(operand);
      }
      else{
          throw new MalformedExpressionException("There is not enough operands");
      }

    }

    @Override
    public int getResult() {
        Operand operand = (Operand) tokenStack.pop();
        return operand.getValue();
    }

    @Override
    public void visit(Operator operator){
        try {
            performOperation(operator);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }
}
