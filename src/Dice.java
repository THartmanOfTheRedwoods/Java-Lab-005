import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        this.sideFacingUp = 1;
        randomGenerator = new Random();
    }
    public void roll(){
        sideFacingUp = randomGenerator.nextInt();
    }
    public int view() {
        return sideFacingUp;
    }
}
