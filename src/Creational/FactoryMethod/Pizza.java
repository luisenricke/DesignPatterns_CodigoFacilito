package Creational.FactoryMethod;

public class Pizza {
    private int slice;
    private String speciality;

    public Pizza(int slice, String speciality) {
        this.slice = slice;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "slice=" + slice +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
