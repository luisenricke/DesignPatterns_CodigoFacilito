package Creational.Prototype;

public class Enemy {
    private String image;
    private int posX, posY, lifes;

    public Enemy(String image, int posX, int posY, int lifes) {
        this.image = image;
        this.posX = posX;
        this.posY = posY;
        this.lifes = lifes;
    }

    //Fist choose
    public Enemy(Enemy enemy){
        this.setImage(enemy.getImage());
        this.setPosX(enemy.getPosX());
        this.setPosY(enemy.getPosY());
        this.setLifes(enemy.getLifes());
    }

    //Second choose
    protected Enemy clone() {
        return new Enemy(this.image,this.posX,this.posY,this.lifes);
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

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }
}
