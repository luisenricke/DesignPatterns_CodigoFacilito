package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu();

        Menu menu2 = new Menu();
        Menu menu3 = new Menu();

        Menu menu4 = new Menu();
        Menu menu5 = new Menu();

        menu3.add(menu4);
        menu3.add(menu5);

        menu1.add(menu2);
        menu1.add(menu3);

        menu2.open();
        menu3.close();
    }
}
