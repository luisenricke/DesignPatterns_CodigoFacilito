package SOLID.FiguresExample;

import SOLID.FiguresExample.IFigure;

public class Rectangle implements IFigure {
    private float base;
    private float height;

    public Rectangle(float base, float height) {
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
        return "Base: " + this.getBase() + ", Height: " + this.getHeight();
    }

    @Override
    public float area() {
        return this.getBase() * this.getHeight();
    }
}
