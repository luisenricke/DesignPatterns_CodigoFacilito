package Behavioral.Visitor;

public interface IVisitor {
    float visit(IFruit fruit);

    float visit(IAppliances appliances);
}
