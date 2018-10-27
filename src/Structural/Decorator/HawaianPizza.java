package Structural.Decorator;

public class HawaianPizza implements IPizza {
    @Override
    public String speciality() {
        return "Hawaian Pizza";
    }

    @Override
    public float price() {
        return 10;
    }
}
