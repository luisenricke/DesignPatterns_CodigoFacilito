package Behavioral.Visitor;

public class Washer implements IAppliances,IVisitable {

    @Override
    public float getPrice() {
        return 20f;
    }

    @Override
    public float applyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
