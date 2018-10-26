package Creational.SimpleFactory;

public class Pizza {
    private int slice;

    public Pizza(int slice) {
        this.slice = slice;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "slice=" + slice +
                '}';
    }
}
