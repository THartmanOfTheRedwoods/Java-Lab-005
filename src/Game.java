import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;
    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == p1) {
            return p2;
        }
        else {
            return p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.printf("%s %d vs. %s %d\n",p1.getName(),p1.getScore(),p2.getName(),p2.getScore());
        if (p1.getScore() > p2.getScore()) {
            return p1.getName() + " Wins";
        }
        else {
            return p2.getName() + " Wins";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many sides should the dice have?");
        int sides = in.nextInt();
        Player p1 = new Player("Randy");
        Player p2 = new Player("Roxxy");
        Dice die = new Dice(sides);
        Game game = new Game(p1,p2,die);
        game.play();
    }

}