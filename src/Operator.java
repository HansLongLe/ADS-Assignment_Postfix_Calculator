import jdk.dynalink.Operation;

public class Operator extends Token{

    Operation operation;

    @Override
    public void accept(CalculatorVisitor visitor) {
    }
}
