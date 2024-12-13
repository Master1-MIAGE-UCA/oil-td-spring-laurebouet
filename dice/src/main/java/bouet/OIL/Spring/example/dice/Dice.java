package bouet.OIL.Spring.example.dice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice{

    private final int facesDice;
    private final Random random;

    public Dice() {
        this(6);
    }
    public Dice(int facesDice) {
        if (Dice.this.facesDice <= 0) {
            throw new IllegalArgumentException("Le nombre de faces doit être supérieur à 0.");
        }
        this.facesDice = Dice.this.facesDice;
        this.random = new Random();
    }
    public int roll() {
        return random.nextInt(Dice.this.facesDice) + 1;
    }
    public int getNumberOfFaces() {
        return Dice.this.facesDice;
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println("Lancé de dé à 6 faces : " + dice.roll());

        Dice customDice = new Dice(20);
        System.out.println("Lancé de dé à 20 faces : " + customDice.roll());
    }
}
