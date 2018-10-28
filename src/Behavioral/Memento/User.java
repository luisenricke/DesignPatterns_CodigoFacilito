package Behavioral.Memento;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User getMemento(){
        return new User(this.getName(),this.getAge());
    }

    public void restartMemento(User user){
        this.setName(user.getName());
        this.setAge(user.getAge());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
