package Structural.Composite;

import java.util.ArrayList;

public class Menu implements IMenu {

    private ArrayList<IMenu> menu;

    public Menu() {
        this.menu = new ArrayList<IMenu>();
    }

    public void add(IMenu menu){
        this.menu.add(menu);
    }

    public IMenu getMenu(int pos){
        return this.menu.get(pos);
    }

    @Override
    public boolean open() {
        System.out.println("This window is Open");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("This windows is Close");
        return true;
    }
}
