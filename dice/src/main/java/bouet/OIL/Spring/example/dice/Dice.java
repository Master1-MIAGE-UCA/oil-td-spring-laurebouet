package bouet.OIL.Spring.example.dice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice{

    private int faces;
    private Random random;

    public Dice() {
        this(6);  }

    public Dice(int faces) {
        if (faces <= 0) {
            throw new IllegalArgumentException("nb de face > 0.");
        }
        this.faces = faces;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(faces) + 1;
    }
    public int getFaces() {
        return faces;
    }
    public void setFaces(int faces) {
        if (faces <= 0) {
            throw new IllegalArgumentException("nb de face > 0.");
        }
        this.faces = faces;
    }
}
