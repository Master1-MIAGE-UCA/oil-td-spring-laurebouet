package bouet.OIL.Spring.example.dice;


import org.springframework.stereotype.Component;

@Component
public class Dice {
    private int faceValue;
    private int numFaces;

    public Dice(int numFaces) {
        this.numFaces = 6;
        roll();
    }

    public void roll() {
        faceValue = (int) (Math.random() * numFaces) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getNumFaces() {
        return numFaces;
    }
}
