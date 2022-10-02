import java.util.Random;
public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int numSides) {
        sides = numSides;
        randomGenerator = new Random();
    }

    public void roll() {
        sideFacingUp = randomGenerator.nextInt(sides) + 1;
    }

    public int view() {
        return sideFacingUp;
    }
}