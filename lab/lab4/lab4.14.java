import java.util.Scanner;

class ScoreBoard {

    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String gameName = sc.nextLine();

        int[] originalScores = new int[3];
        for (int i = 0; i < 3; i++) {
            originalScores[i] = sc.nextInt();
        }

        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);

        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScores[0] = sc.nextInt();

        sb1.displayScores();
        sb2.displayScores();
    }
}
