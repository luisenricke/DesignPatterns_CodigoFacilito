package Behavioral.Mediator;

import java.util.HashMap;

public class ChatRoom {
    private HashMap<String, User> users;

    public ChatRoom() {
        this.users = new HashMap<String, User>();
    }

    public void addUser(User user) {
        this.users.put(user.getName(), user);
    }

    public void sendMessage(User send, User receive, String message) {
        if (this.users.get(send.getName()) != null &&
                this.users.get(receive.getName()) != null) {
            message = "To: " + receive.getName() + " message: " + message;
            receive.getMessage(message);
        }
    }
}
