package Structural.Facade;

public class FacadeComputer {
    private Computer computer;

    public FacadeComputer() {
        Keyboard keyboard= new Keyboard();
        Mouse mouse = new Mouse();

        this.computer = new Computer(keyboard,mouse);
    }

    public void turnOn(){
        this.computer.turnOn();
    }
}
