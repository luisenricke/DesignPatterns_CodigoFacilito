package Creational.FactoryMethod;

public class Pizzeria implements IPizzeria {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Peperoni"))
            return new Pizza(4, "Peperoni");
        else if (type.equals("Hawaiana"))
            return new Pizza(6, "Hawaiana");
        else if (type.equals("Cheese pizza of peperoni"))
            return new CheesePizza(10,"Peperoni");

        return null;
    }
}
