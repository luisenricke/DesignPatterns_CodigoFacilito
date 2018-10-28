package Behavioral.Visitor;

public class discountCommon implements IVisitor {


    @Override
    public float visit(IFruit fruit) {
        return fruit.getPrice()*0.10f;
    }

    @Override
    public float visit(IAppliances appliances) {
        return appliances.getPrice()*1.05f;
    }
}
