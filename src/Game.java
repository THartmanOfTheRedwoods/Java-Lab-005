import java.util.Scanner;

public class Game {
     Player p1;
     Player p2;
     Dice die;

    public void play() {
        Player current = this.p1;

        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);

        announceWinner();
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            current = this.p2;
        } else if (current == this.p2) {
            current = this.p1;
        }
        return current;
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public void announceWinner() {
        int p1Score = p1.getScore();
        int p2Score = p2.getScore();

        System.out.printf("%s%nScore:%d%n%s%nScore:%d%n",p1.getName() ,p1Score, p2.getName(), p2Score);

        if (p1Score > p2Score) {
            System.out.println("The Winner is....  \n" + p1.getName() + "!");
        } else if (p1Score < p2Score) {
            System.out.println("The Winner is....  \n" + p2.getName() + "!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner input = new Scanner(System.in);

        System.out.println("Type Player 1's name:");
            name1 = input.nextLine();
        System.out.println("Type Player 2's name");
            name2 = input.nextLine();
        System.out.println("Type the number of sides:");
        int sides = input.nextInt();
        Game start = new Game(new Player(name1), new Player(name2), new Dice(sides));
        start.play();
    }

    public Game(Player One, Player Two, Dice dieNum) {
        p1 = One;
        p2 = Two;
        die = dieNum;
    }
}
