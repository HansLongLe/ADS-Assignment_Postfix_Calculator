
public class Operator extends Token{

    Operation operation;

    public Operator(CalculatorVisitor visitor, Operation operation) {
        super(visitor);
        this.operation = operation;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public Operation getOperation()
    {
        return operation;
    }
}
