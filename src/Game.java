import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game(Player p1,Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        System.out.println(announceWinner() + " is the winner!!!!!!");
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            current = this.p2;
        } else {
            current = this.p1;
        }
        return current;
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        String winner;
        System.out.println(p1.getName()+": "+p1.getScore());
        System.out.println(p2.getName()+": "+p2.getScore());
        if (p1.getScore() > p2.getScore()) {
            winner = p1.getName();
        } else {
            winner = p2.getName();
        }
        return winner;
    }

    public static void main(String[] args) {

        System.out.println("How many sides does your dice have:");
        Scanner sideCheck = new Scanner(System.in);
        int numSides = sideCheck.nextInt();
        Player p1 = new Player("Kodiak");
        Player p2 = new Player("Xander");
        Dice die = new Dice(numSides);
        Game winning = new Game(p1, p2, die);
        winning.play();
    }
}

