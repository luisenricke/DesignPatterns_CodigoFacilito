package SOLID.AnimalsExample;

public class Jaguar extends Animal implements IFelineWild {
    private int age;
    private float weight;

    public Jaguar() {
        this.setAge(0);
        this.setWeight(0f);
    }

    public Jaguar(int age) {
        this.age = age;
    }

    public Jaguar(float weight) {
        this.weight = weight;
    }

    public Jaguar(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void sleep() {
        System.out.println("Jaguar sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Jaguar eats");
    }

    @Override
    public void roar() {
        System.out.println("Jaguar roars");
    }

    @Override
    public void hunt() {
        System.out.println("Jaguar hunts");
    }
}
