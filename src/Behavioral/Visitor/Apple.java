package Behavioral.Visitor;

public class Apple implements IFruit, IVisitable {


    @Override
    public float getPrice() {
        return 2f;
    }

    @Override
    public float applyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
