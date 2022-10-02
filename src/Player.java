public class Player {
    private String name;
    private int score;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return null;
    }
        return name;
    }
    public int getScore() {
        return score;
    }
    public void toss(Dice die) {
        die.roll();
        score = die.view();

    }
    //roll die and record its view in the score instance variable();
            this.score = die 1.view();
        }



