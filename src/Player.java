public class Player {
    private String name;
    private int score;

    public String getName() {
        return name;
    }
    private  int getScore() {
        return score;
    }
    public int toss(Dice sides){
        sides.roll();
        score = sides.view();
        return score;
    }
    public Player(String n) {
        name = n;
    }
}
