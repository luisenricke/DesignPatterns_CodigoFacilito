package Behavioral.State;

public class CarDrive implements IStateCar{
    private final Car car;

    public CarDrive(Car car) {
        this.car = car;
    }

    @Override
    public void turOn() {
        System.out.println("The car is On");
    }

    @Override
    public void drive() {
        System.out.println("the car its actually moving");
    }

    @Override
    public void turnOff() {
        System.out.println("The car is actually off");
    }
}
