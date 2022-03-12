import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CalculationTest {
    private Client client;
    private Calculator calculator;

    @Before public void setUp() {
        calculator = new CalculatorVisitor();
        client = new Client((CalculatorVisitor) calculator);

    }

    @Test public void evaluateExpression(){
        ArrayList<Token> tokenList = new ArrayList<Token>();
        Operand operand1 = new Operand((CalculatorVisitor) calculator, 0);
        Operand operand2 = new Operand((CalculatorVisitor) calculator, 1);
        Operand operand3 = new Operand((CalculatorVisitor) calculator, 2);
        Operand operand4 = new Operand((CalculatorVisitor) calculator, 3);
        Operand operand5 = new Operand((CalculatorVisitor) calculator, 4);

        Operator operator1 = new Operator((CalculatorVisitor) calculator, Operation.PLUS);
        Operator operator2 = new Operator((CalculatorVisitor) calculator, Operation.MINUS);
        Operator operator3 = new Operator((CalculatorVisitor) calculator, Operation.DIVISION);
        Operator operator4 = new Operator((CalculatorVisitor) calculator, Operation.MULTIPLICATION);

        tokenList.add(operand1);
        tokenList.add(operand2);
        tokenList.add(operand3);
        tokenList.add(operand4);
        tokenList.add(operand5);
        tokenList.add(operator1);
        tokenList.add(operator2);
        tokenList.add(operator3);
        tokenList.add(operator4);

        assertEquals(0, client.evaluateExpression(tokenList));
    }

}
