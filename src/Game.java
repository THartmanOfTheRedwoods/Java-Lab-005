import java.util.Scanner;

/**
 * stephanie byrd
 * October1,2022
 */
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
        announceWinner();
    }

    private void announceWinner() {
    }

    private void takeTurn(Player current) {
    }


    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public void takeTurn(Player player);

    {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.printf("Player 1: %s %d %n", p1.getName(), p1.getScore());
        System.out.printf("Player 2: %s %d %n", p2.getName(), p2.getScore());
        if (p1.getScore() > p2.getScore()) {
            System.out.println("Winner " + p1.getName());
            return p1.getName();
        } else if (p1.getScore() == p2.getScore()) {
            System.out.println("Tie");
            return "Tie";
        } else {
            System.out.println("Winner " + p2.getName());
            return p2.getName();
        }
    }

    public static void main
    Scanner scanner;
        (String[])

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of sides:");

        //Request and store in an int variable the number of sides you Dice should have.
        Dice d1 = new Dice(scanner.nextInt());

        //Create a new Game object and pass its constructor two new Player objects, and a new Dice object.

        Player p1 = new Player("Steph");
        Player p2 = new Player("Sagan");
        Game diceGame = new Game(p1, p2, d1);
        //Finally, use the Game object to call the play method and play the game.
        diceGame.play();
    }
}

}
        }
        }
