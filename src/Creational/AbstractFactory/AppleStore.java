package Creational.AbstractFactory;

public class AppleStore implements IAbstractFactory {

    @Override
    public IComputer createComputer() {
        return new MacbookPro();
    }

    @Override
    public ITablet createTablet() {
        return new IPad();
    }
}
