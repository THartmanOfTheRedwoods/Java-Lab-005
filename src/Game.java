import java.util.Scanner;

/**
 * Brennan Duffy
 * 9/28/2022
 */
public class Game {
    private Player p1;
    private Player p2;
    private Dice die;

    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(p1);
        takeTurn(current);
        System.out.println("The winner is " + announceWinner() + "!");
    }

    public Player nextPlayer(Player current) {
        return current == p1 ? p2 : p1;
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.println("Player 1: " + p1.getName() + ", " + p1.getScore());
        System.out.println("Player 2: " + p2.getName() + ", " + p2.getScore());
        return p1.getScore() >= p2.getScore() ? p1.getName() : p2.getName(); // the system favors player 1
    }

    public static void main(String[] args) {
        System.out.print("Number of sides on the die: ");
        int sides = new Scanner(System.in).nextInt();
        Game game = new Game(new Player("Jordan"), new Player("Jordan"), new Dice(sides));
        game.play();
    }
}
