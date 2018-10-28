package Behavioral.State;

public class Car implements IStateCar {

    private IStateCar carOn;
    private IStateCar carOff;
    private IStateCar carDrive;

    private IStateCar actualState;

    public Car() {
        this.carOn = new CarOn(this);
        this.carOff = new CarOff(this);
        this.carDrive = new CarDrive(this);
        this.actualState = carOn;
    }

    @Override
    public void turOn() {
        this.actualState.turOn();
    }

    @Override
    public void drive() {
        this.actualState.drive();
    }

    @Override
    public void turnOff() {
        this.actualState.turnOff();
    }

    public IStateCar getCarOn() {
        return carOn;
    }

    public void setCarOn(IStateCar carOn) {
        this.carOn = carOn;
    }

    public IStateCar getCarOff() {
        return carOff;
    }

    public void setCarOff(IStateCar carOff) {
        this.carOff = carOff;
    }

    public IStateCar getCarDrive() {
        return carDrive;
    }

    public void setCarDrive(IStateCar carDrive) {
        this.carDrive = carDrive;
    }

    public IStateCar getActualState() {
        return actualState;
    }

    public void setActualState(IStateCar actualState) {
        this.actualState = actualState;
    }
}
