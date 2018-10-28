package Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        IDevice tv = new TV();

        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);

        on.operation();
        off.operation();
    }
}
