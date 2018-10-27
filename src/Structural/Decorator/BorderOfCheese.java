package Structural.Decorator;

public class BorderOfCheese implements IPizza {

    private IPizza pizza;

    public BorderOfCheese(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String speciality() {
        return this.pizza.speciality() + " with Border of Cheese";
    }

    @Override
    public float price() {
        return this.pizza.price() + 4;
    }
}

