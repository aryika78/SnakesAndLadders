//WAP TO IMPLEMENT THE GAME OF SNAKES AND LADDERS, WHERE THERE ARE TWO PLAYERS AND BOTH WILL HAVE TO SCORE 50.
//WHEN A PLAYER GETS LADDER, SCORE WILL BE INCREASED BY 5,IF A PLAYER IS BITTEN BY SNAKE THE SCORE WILL BE DECREASED BY 8.
// LADDER-> 7, 19, 31, 37
//SNAKES-> 9, 16, 23,33, 40, 46, 49

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class Board {
    BufferedReader br;
    Random ra = new Random();

    synchronized int throwDice(String playerName) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) { }

        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n\n" + playerName + " -> PRESS ENTER TO THROW DICE:");
        try {
            br.read();
        } catch (Exception e) { }

        int dice = ra.nextInt(6) + 1;
        return dice;
    }
}

class GamePlayer implements Runnable {
    Thread thread;
    String playerName;
    int score;
    Board board;

    GamePlayer(String playerName, Board board) {
        thread = new Thread(this);
        score = 0;
        this.playerName = playerName;
        this.board = board;
        thread.start();
    }

    public void run() {
        while (true) {
            int dice = board.throwDice(playerName);
            System.out.print("\n\nPREVIOUS SCORE = " + score + " | DICE = " + dice);
            score += dice;

            if (score == 50) {
                System.out.print("\n\n🏆 " + playerName + " HAS WON THE GAME!");
                System.exit(0);
            } else if (score > 50) {
                score -= dice;
            } else if (score == 7 || score == 19 || score == 31 || score == 37) {
                System.out.print("\n\n🎉 " + playerName + " GOT A LADDER! +5 BONUS");
                score += 5;
            } else if (score == 9 || score == 16 || score == 23 || score == 33 || score == 40 || score == 46 || score == 49) {
                System.out.print("\n\n🐍 " + playerName + " GOT BITTEN BY A SNAKE! -8 PENALTY");
                score -= 8;
                if (score < 0) score = 0;
            }

            System.out.println("\nCURRENT SCORE FOR " + playerName + " IS: " + score);
        }
    }
}

public class SnakesAndLaddersGame {
    public static void main(String[] args) {
        Board board = new Board();
        GamePlayer p1 = new GamePlayer("Player 1", board);
        GamePlayer p2 = new GamePlayer("Player 2", board);

    }
}
