public class Player {

    private String name;
    private int score = 0;

    public Player(String username) {
        name = username;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void toss(Dice bigDice) {
        bigDice.roll();
        score += bigDice.view();
    }
}