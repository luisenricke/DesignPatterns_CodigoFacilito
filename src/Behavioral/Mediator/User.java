package Behavioral.Mediator;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void getMessage(String message){
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
