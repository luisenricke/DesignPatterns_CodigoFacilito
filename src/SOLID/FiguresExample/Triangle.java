package SOLID.FiguresExample;

import SOLID.FiguresExample.IFigure;

public class Triangle implements IFigure {
    private float base;
    private float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }


    @Override
    public float area() {
        return (this.getBase() * this.getHeight()) / 2;
    }
}
