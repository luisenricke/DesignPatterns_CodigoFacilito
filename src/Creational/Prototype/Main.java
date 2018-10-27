package Creational.Prototype;

public class Main {

    public static void main(String[] args) {
        Enemy base1 = new Enemy("image.png",0,100,10);

        Enemy e1 = new Enemy(base1);
        Enemy e2 = new Enemy(base1);
        Enemy e3 = new Enemy(base1);
        e1.setPosX(100);
        e2.setPosX(200);
        e3.setPosX(300);

        Enemy base2 = new Enemy("imagen2.png",0,200,10);
        Enemy e4 = base2.clone();
        Enemy e5 = base2.clone();
        Enemy e6 = base2.clone();

        e4.setPosX(100);
        e5.setPosX(200);
        e6.setPosX(300);
    }
}
