package Creational.AbstractFactory;

public class SamsumgStore implements IAbstractFactory {
    @Override
    public IComputer createComputer() {
        return new QX410();
    }

    @Override
    public ITablet createTablet() {
        return new A8();
    }
}
