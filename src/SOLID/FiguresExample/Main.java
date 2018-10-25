package SOLID.FiguresExample;

public class Main {
    public static void main(String[] args) {
        //Single Responsability - High cohesion
        Rectangle rectangle = new Rectangle(10f,20f);
        Triangle triangle = new Triangle(10,10);
        Presentation presentation = new Presentation();

        //Open/Close
        presentation.area(rectangle);
        presentation.area(triangle);
    }
}
