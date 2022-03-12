public interface Visitor {
    void visit(Operator operator) throws MalformedExpressionException;
    void visit(Operand operand);
}
