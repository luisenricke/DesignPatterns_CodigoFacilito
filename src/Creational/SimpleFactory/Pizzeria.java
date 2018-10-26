package Creational.SimpleFactory;

public class Pizzeria {

    public Pizza createLittlePizza(){
        return new Pizza(4);
    }

    public Pizza createMediumPizza(){
        return new Pizza(6);
    }

    public Pizza createBigPizza(){
        return new Pizza(12);
    }
}
