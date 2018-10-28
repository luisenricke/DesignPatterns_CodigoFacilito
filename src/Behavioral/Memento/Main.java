package Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        User user = new User("Luis",23);
        User memento = user.getMemento();

        System.out.println(user.getName());
        System.out.println(user.getAge());

        user.setName("Nashe");
        user.setAge(22);

        System.out.println(user.getName());
        System.out.println(user.getAge());

        user.restartMemento(memento);

        System.out.println(user.getName());
        System.out.println(user.getAge());

    }
}
