package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        User user = new User(5);
        //IService service = new ProxyService(new Service(),user);
        IService service = new ProxyService(user);

        service.read();
        service.create();
        service.update();
        service.delete();
    }
}
