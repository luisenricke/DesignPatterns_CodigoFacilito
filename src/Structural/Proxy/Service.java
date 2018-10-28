package Structural.Proxy;

public class Service implements IService {

    @Override
    public void create() {
        System.out.println("Create in the db");
    }

    @Override
    public void read() {
        System.out.println("Read in the db");
    }

    @Override
    public void update() {
        System.out.println("Update in the db");
    }

    @Override
    public void delete() {
        System.out.println("Delete in the db");
    }
}
