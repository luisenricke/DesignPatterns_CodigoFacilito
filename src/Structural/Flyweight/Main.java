package Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        CloudFactory factory = new CloudFactory();

        for (int i = 0; i < 100; i++) {
            Cloud cloud = factory.getCloud(TypeCloud.SMALL);
        }

        for (int i = 0; i < 200; i++) {
            Cloud cloud = factory.getCloud(TypeCloud.MEDIUM);
        }

        for (int i = 0; i < 300; i++) {
            Cloud cloud = factory.getCloud(TypeCloud.BIG);
        }

        System.out.println(factory.countCloudMap());

    }
}
