import java.util.Scanner;

public class Workbook510 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        int score = 0;

        for ( ; ; ) {
            int min = 1;

            int max = 6;

            int diceRoll = (int) (Math.random() * (max - min + 1) + min);

            if (diceRoll == 4) {
                continue;
            } else if (diceRoll == 6) {

                System.out.println("End of game ");
                break;
            } else {
                score++;
            }

        }
        System.out.println(score);
    }

}
