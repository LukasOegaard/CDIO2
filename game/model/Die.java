package model;

import configuration.Config;

public class Die {
    
    private int faceValue;

    public Die() {
        this.faceValue = Config.DEFAULT_DIE_FACE_VALUE;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public void roll() {
        this.faceValue = (int)(Math.random() * 6) + 1;
    }

}
