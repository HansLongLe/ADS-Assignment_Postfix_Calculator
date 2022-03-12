public class Operand extends Token {

    public int value;

    @Override
    public void accept(CalculatorVisitor visitor) {
    }

    public int getValue() {
        return value;
    }
}
