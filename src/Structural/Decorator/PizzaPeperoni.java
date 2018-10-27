package Structural.Decorator;

public class PizzaPeperoni implements IPizza {
    @Override
    public String speciality() {
        return "Peperoni pizza";
    }

    @Override
    public float price() {
        return 10;
    }
}
