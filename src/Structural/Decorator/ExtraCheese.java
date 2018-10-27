package Structural.Decorator;

public class ExtraCheese implements IPizza {

    private IPizza pizza;

    public ExtraCheese(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String speciality() {
        return this.pizza.speciality() + " with extra of Cheese";
    }

    @Override
    public float price() {
        return this.pizza.price() + 2;
    }
}
