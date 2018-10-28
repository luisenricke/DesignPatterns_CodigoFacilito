package Behavioral.TemplateMethod;

public abstract class User {
    public void auth() {
        System.out.println("All users need to authentication");
    }

    abstract void wayOfWorking();
}
