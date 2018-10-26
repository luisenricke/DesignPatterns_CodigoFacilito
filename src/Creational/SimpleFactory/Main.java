package Creational.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Pizzeria dominos = new Pizzeria();

        Pizza hawaiana = dominos.createMediumPizza();
        System.out.println(hawaiana);
    }
}
