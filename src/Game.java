import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;
    public static void main(){
        Dice dl = new Dice(6);
    }

    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1){
            current = this.p2;
        } else if (current == this.p2) {
            current = this.p1;
        }
        return current;
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        int p1score = p1.getscore();
        int p2score = p2.getscore();
        System.out.println();
      if (p1score > p2score) {
          System.out.println("The winner is... \n" + p1.getName());
      } else if (p1score < p2score) {
          System.out.println("The Winner is... \n" + p2.getName());
          }
      else () {
          System.out.println("It's a draw!");
      }
    }

    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Player 1's name:");
        name1 = input.nextLine();
        System.out.println("Enter Player 2's name:");
        name2 = input.nextLine();
        System.out.println("Type the number of sides:");
        int sides = input.nextInt();
    }
}
