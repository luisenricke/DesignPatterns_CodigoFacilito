package Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Washer washer = new Washer();

        IVisitor discount = new discountCommon();
        System.out.println(apple.applyDiscount(discount));
        System.out.println(washer.applyDiscount(discount));

    }
}
