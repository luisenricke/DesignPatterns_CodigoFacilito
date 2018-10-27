package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        ConnectionDB connectionDB1 = ConnectionDB.instance();
        ConnectionDB connectionDB2 = ConnectionDB.instance();

        System.out.println(connectionDB1.hashCode());
        System.out.println(connectionDB2.hashCode());

    }
}
