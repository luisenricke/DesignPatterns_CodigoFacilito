package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        IPizza peperoni = new ExtraCheese(new PizzaPeperoni());
        System.out.println(peperoni.speciality());
        System.out.println(peperoni.price());

        IPizza hawaiana = new BorderOfCheese(new ExtraCheese(new HawaianPizza()));
        System.out.println(hawaiana.speciality());
        System.out.println(hawaiana.price());
    }
}
