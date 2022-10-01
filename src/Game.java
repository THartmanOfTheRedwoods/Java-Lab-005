import java.util.Random;
import java.util.Scanner;
public class Game {
    Player p1;
    Player p2;
    Dice die;
    Player current;
    public Game (Player p1,Player p2,Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
    public void play() {
        current = p1;
        takeTurn(current);
        nextPlayer(current);
        takeTurn(current);
        announceWinner();
    }

    public void nextPlayer(Player player) {
        if (player == p1){
            current = p2;
        }

    }

    public void takeTurn(Player player) {
        player.toss(die);
    }

    public void announceWinner() {
        System.out.print(p1.getName()+" has ");
        System.out.println(p1.getScore()+" points");
        System.out.print(p2.getName()+" has ");
        System.out.println(p2.getScore()+" points");

        if (p1.getScore()> p2.getScore()){
            System.out.println(p1.getName()+" Wins");
        }else if (p1.getScore()< p2.getScore()){
            System.out.println(p2.getName()+" Wins");
        }else{
            System.out.println("Tie, you both lose.");
        }


    }

    public static void main(String[] args) {
        Scanner scoon = new Scanner(System.in);
        System.out.println("Enter player one name:");
        String p01 = scoon.nextLine();
        Player p1 = new Player(p01);
        System.out.println("Enter player two name:");
        String p02 = scoon.nextLine();
        Player p2 = new Player(p02);

        System.out.println("How many sides should the dice have?");
        int sides01 = scoon.nextInt();
        Dice die = new Dice(sides01);

        Game game = new Game(p1,p2,die);
        game.play();




    }
}
class Dice  {
    private int sideFacingUp;
    private final int sides;
    private final Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }
    public void roll() {
        this.sideFacingUp = randomGenerator.nextInt(sides)+1;
    }
    public int view() {
        return sideFacingUp;
    }
}

class Player  {
    private final String name;
    private int score;

    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void toss(Dice die1){
        die1.roll();
        score += die1.view();
    }

}
