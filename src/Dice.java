import java.util.Random;

public class Dice {
    private int sides;
    private int sideFaceUp;
    private Random randomGenerator;

    public Dice (int sides) {
        this.sides = sides;
        this.sideFaceUp = 1;
        randomGenerator = new Random();
    }

    public void roll () {
        sideFaceUp = randomGenerator.nextInt(sides); //set to random int between 0 and number of sides
    }
    public int view () {
        return sideFaceUp; //return roll result
    }
}
