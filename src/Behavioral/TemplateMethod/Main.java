package Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        User manager = new Manager();
        User admin = new Admin();

        admin.auth();
        admin.wayOfWorking();

        manager.auth();
        manager.wayOfWorking();
    }
}
