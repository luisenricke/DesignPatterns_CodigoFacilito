package Structural.Proxy;

public class ProxyService implements IService {
    private IService service;
    private User user;

    public ProxyService(/*IService service,*/User user) {
        //this.service = service;
        this.user = user;
    }

    public IService instance(){
        if (this.service==null)
            this.service = new Service();

        return this.service;
    }

    @Override
    public void create() {
        if (this.user.getLevelPermision() >= 5)
            this.instance().create();
        else
            throw new UnsupportedOperationException("Permission denied, level of permission low");
    }

    @Override
    public void read() {
        this.instance().read();
    }

    @Override
    public void update() {
        if (this.user.getLevelPermision() >= 5)
            this.instance().update();
        else
            throw new UnsupportedOperationException("Permission denied, level of permission low");

    }

    @Override
    public void delete() {
        if (this.user.getLevelPermision() >= 5)
            this.instance().delete();
        else
            throw new UnsupportedOperationException("Permission denied, level of permission low");
    }
}
