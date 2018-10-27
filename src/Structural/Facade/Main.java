package Structural.Facade;

public class Main {
    public static void main(String[] args) {

        /*Keyboard keyboard= new Keyboard();
        Mouse mouse = new Mouse();

        Computer computer = new Computer(keyboard,mouse);
        computer.turnOn();*/

        FacadeComputer computer = new FacadeComputer();
        computer.turnOn();
    }
}
