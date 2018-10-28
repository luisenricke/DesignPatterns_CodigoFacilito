package Behavioral.Command;

public class OnDevice implements ICommand{

    private IDevice device;

    public OnDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void operation() {
        this.device.On();
    }
}
