package Structural.Flyweight;

public class Cloud {

    private TypeCloud type;
    private String image;
    private int posX, posY;

    public Cloud(TypeCloud type, String image, int posX, int posY) {
        this.type = type;
        this.image = image;
        this.posX = posX;
        this.posY = posY;
    }

    public TypeCloud getType() {
        return type;
    }

    public void setType(TypeCloud type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
