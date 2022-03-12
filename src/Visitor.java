public interface Visitor {
    void visit(Operator operator);
    void visit(Operand operand);
}
