package Behavioral.State;

public class CarOn implements IStateCar {

    private final Car car;

    public CarOn(Car car) {
        this.car = car;
    }

    @Override
    public void turOn() {
        System.out.println("The car is On");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
        car.setActualState(car.getCarDrive());
    }

    @Override
    public void turnOff() {
        System.out.println("The car is off");
        car.setActualState(car.getCarOff());
    }
}
