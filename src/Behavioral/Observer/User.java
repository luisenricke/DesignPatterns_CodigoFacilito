package Behavioral.Observer;

public class User implements IObserver {



    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
