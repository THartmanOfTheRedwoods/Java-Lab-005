import java.util.Random;
import java.util.Scanner;


class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;
    public Dice(int sides) {
        this.sides = sides;
        randomGenerator = new Random();
    }
    public void roll() {
        sideFacingUp = randomGenerator.nextInt(1,sides);
    }
    public int view() {
        return sideFacingUp;
    }

}
class Player {
    private String name;
    private int score;
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public void toss(Dice d1){
        d1.roll();
        score += d1.view();
    }
}
public class Game {

    Player p1;
    Player p2;
    Dice die;
    public Game(Player p1, Player p2, Dice die){
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
    public void play() {
        Player current = this.p1;
        takeTurn(p1);
        nextPlayer(current);
        takeTurn(p2);
        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1){
            current = this.p2;
        }
        else if (current == this.p2){
            current = this.p1;
        }
        return current;
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        Player victory = null;
        if (p1.getScore() > p2.getScore()) {
            victory = p1;
        } else if (p1.getScore() < p2.getScore()) {
            victory = p2;
        }
        else {
            return ("Tie");
        }
        return ("Player 1: " + p1.getName() + " " + p1.getScore() + "\nPlayer 2: "
                + p2.getName() + " " + p2.getScore() + "\n" + victory.getName() + " wins!");
    }

    public static void main(String[] args) {
        System.out.print("Insert the amount of sides on the di: ");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();
        Dice d1 = new Dice(sides);
        Player p1 = new Player("Will");
        Player p2 = new Player("Bill");
        Game game = new Game(p1,p2,d1);
        game.play();

    }
}