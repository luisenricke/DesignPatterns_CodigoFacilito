package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        Product pizza = new Product(5);

        User luis = new User();
        User nashe = new User();
        User chacon = new User();

        pizza.addObserver(luis);
        pizza.addObserver(nashe);

        pizza.sale();
    }
}
