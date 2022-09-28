import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
    }

    public void roll() {
        randomGenerator = new Random();
        sideFacingUp = randomGenerator.nextInt(sides-1)+1;
    }
    public int view() {
        return sideFacingUp;
    }
}
