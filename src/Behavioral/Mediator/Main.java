package Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        User luis = new User("Luis");
        User nashe = new User("Nashe");

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addUser(luis);
        chatRoom.addUser(nashe);

        chatRoom.sendMessage(luis,nashe,"I <3 u");

    }
}
