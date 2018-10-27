package Structural.Facade;

public class Keyboard implements IKeyboard {
    @Override
    public void connect() {
        System.out.println("Keyboard connection via USB");
    }
}
