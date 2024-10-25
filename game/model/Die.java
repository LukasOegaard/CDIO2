package game.model;

public class Die {
    
    private int faceValue;

    public Die() {
        this.faceValue = 1;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public void roll() {
        this.faceValue = (int)(Math.random() * 6) + 1;
    }

}
