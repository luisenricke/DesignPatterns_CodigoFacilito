package Behavioral.Command;

public class TV implements IDevice{

    private boolean on;

    public TV() {
        this.on = false;
    }

    @Override
    public void On() {
        this.on = true;
        System.out.println("TV is On");
    }

    @Override
    public void Off() {
        this.on= false;
        System.out.println("TV is Off");
    }
}
