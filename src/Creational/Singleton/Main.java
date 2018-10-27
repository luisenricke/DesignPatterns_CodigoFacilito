package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        ConnectionDB connectionDB1 = ConnectionDB.instance();
        ConnectionDB connectionDB2 = ConnectionDB.instance();

        System.out.println(connectionDB1.hashCode());
        System.out.println(connectionDB2.hashCode());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connectionDB = ConnectionDB.instance();
                System.out.println(connectionDB.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connectionDB = ConnectionDB.instance();
                System.out.println(connectionDB.hashCode());
            }
        });

        t1.start();
        t2.start();
    }
}
