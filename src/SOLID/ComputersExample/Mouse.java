package SOLID.ComputersExample;

public class Mouse implements IMouse {
    @Override
    public void connect() {
        System.out.println("Mouse connection via USB");
    }
}
