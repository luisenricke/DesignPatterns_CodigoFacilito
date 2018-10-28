package Structural.Proxy;

public class User {
    private int levelPermision;

    public User(int levelPermision) {
        this.levelPermision = levelPermision;
    }

    public int getLevelPermision() {
        return levelPermision;
    }

    public void setLevelPermision(int levelPermision) {
        this.levelPermision = levelPermision;
    }
}
