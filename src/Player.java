public class Player {
    private String name;
    private int score;

    public Player (String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName () {
        return this.name;
    }
    public int getScore () {
        return this.score;
    }
    public void toss (Dice d1) {
        //roll die and record its view in the score instance variable
        d1.roll();
        this.score = d1.view();
    }
}
