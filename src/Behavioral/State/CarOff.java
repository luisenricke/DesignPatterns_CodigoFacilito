package Behavioral.State;

public class CarOff implements IStateCar {
    private final Car car;

    public CarOff(Car car) {
        this.car = car;
    }

    @Override
    public void turOn() {
        System.out.println("The car is On");
        car.setActualState(car.getCarOn());
    }

    @Override
    public void drive() {
        System.out.println("the car can not be driven if it is turned off");
    }

    @Override
    public void turnOff() {
        System.out.println("The car is off");
        car.setActualState(car.getCarOff());
    }
}
