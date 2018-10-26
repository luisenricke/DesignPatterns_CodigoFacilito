package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Pizzeria dominos = new Pizzeria();

        Pizza peperoni = dominos.createPizza("Peperoni");
        Pizza hawaiana = dominos.createPizza("Hawaiana");
        Pizza cheese = dominos.createPizza("Cheese pizza of peperoni");

        System.out.println(peperoni);
        System.out.println(hawaiana);
        System.out.println(cheese);
    }
}
