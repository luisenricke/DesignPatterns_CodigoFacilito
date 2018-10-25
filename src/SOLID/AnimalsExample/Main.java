package SOLID.AnimalsExample;


public class Main {
    public static void main(String[] args) {
        //Likov and Interface Segregation
        Jaguar jaguar = new Jaguar(10,50f);
        jaguar.sleep();
        jaguar.hunt();
        jaguar.roar();
    }
}
