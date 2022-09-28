import java.util.Random;
import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game (Player p1, Player p2, Dice d1) {
        //assign parameters to game instance variables
        this.p1 = p1;
        this.p2 = p2;
        this.die = d1;
        play();
    }
    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        announceWinner();
    }

    public Player nextPlayer(Player current) {
        if (current == p1) {
            return p2;
        } else {
            return p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.println(p1.getName());
        System.out.println("Score = " + p1.getScore());
        System.out.println(p2.getName());
        System.out.println("Score = " + p2.getScore());
        if (p1.getScore() > p2.getScore()) {
            return p1.getName();
        } else if (p2.getScore() > p1.getScore()) {
            return p2.getName();
        } else {
            return "tie";
        }
    }

    public static void main(String[] args) {
        System.out.println("How many sides on the die?");
        Scanner scanner = new Scanner(System.in);
        int diceSides = scanner.nextInt();
        System.out.println("Player 1: ");
        Scanner scanner2 = new Scanner(System.in);
        String player1 = scanner2.nextLine();
        System.out.println("Player 2: ");
        Scanner scanner3 = new Scanner(System.in);
        String player2 = scanner3.nextLine();
        Game game1 = new Game (new Player(player1), new Player(player2), new Dice(diceSides));

    }
}
