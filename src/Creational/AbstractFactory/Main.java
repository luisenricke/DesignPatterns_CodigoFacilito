package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        SamsumgStore samsumgStore = new SamsumgStore();
        AppleStore appleStore = new AppleStore();

        IComputer mac = appleStore.createComputer();
        ITablet ipad = appleStore.createTablet();

        IComputer qx = samsumgStore.createComputer();
        ITablet a8 = samsumgStore.createTablet();
    }
}
