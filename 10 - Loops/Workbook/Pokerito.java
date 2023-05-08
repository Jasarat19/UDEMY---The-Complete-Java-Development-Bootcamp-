import java.util.Random;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.\n" + "It's like Poker, but a lot simpler.\n");

        System.out.println("-There are two players, you and the computer.\n");
        System.out.println("-The dealer will give each player one card.\n");
        System.out.println("-Then, the dealer will draw five cards (the river)\n");
        System.out.println("-The player with the most river matches wins!\n");
        System.out.println("-If the matches are equal, everyone's a winner!\n");
        System.out.println("-Ready? Type anything if you are.");

        scan.nextLine();

        /*
         * Task 3: Present the user with a card
         * println 'Here's your card:'
         * <show card>
         * <new line>
         * println 'Here's the computer's card:'
         * <show computer's card>
         */

        System.out.println(" Here's your card: ");
        String usersCard = randomCard();
        System.out.println(usersCard);

        System.out.println(" Here's the computer's card: ");
        String computerCard = randomCard();
        System.out.println(computerCard);

        int userPoint = 0;
        int computerPoint = 0;

        /**
         * Task 4 - Draw five cards
         * 
         * • print: Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         * Card 1
         * <2 new lines>
         * <print card>
         * Card 2
         * <2 new lines>
         * <print card>
         * ...
         */

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Card " + (i + 1));
            String dealerCard = randomCard();
            System.out.println(dealerCard);
            if (dealerCard.equals(usersCard)) {
                userPoint++;
            }
            if (dealerCard.equals(computerCard)) {
                computerPoint++;
            }
           
        }

        /**
         * Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches: <computerMatches>
         * 
         * • If you have more matches, print: You win!.
         * • If the computer has more matches, print: The computer wins
         * • If the matches are equal, print: everyone wins!.
         */

         System.out.println("Your number of matches: " + userPoint); 
         System.out.println("Computer number of matches: " + computerPoint);

        if(userPoint < computerPoint){
            System.out.println("The computer wins");
        }
        else if(userPoint > computerPoint){
            System.out.println("You win!.");
        }
        else if(userPoint == computerPoint){
            System.out.println("everyone wins");
        }
      



        scan.close();
    }

    public static String randomCard() {
        int diceRoll = (int) (Math.random() * 13 + 1);
        if (diceRoll == 1) {
            return "   _____\n" +
                    "  |A _  |\n" +
                    "  | ( ) |\n" +
                    "  |(_'_)|\n" +
                    "  |  |  |\n" +
                    "  |____V|\n";

        } else if (diceRoll == 2) {
            return "   _____\n" +
                    "  |A _  |\n" +
                    "  | ( ) |\n" +
                    "  |(_'_)|\n" +
                    "  |  |  |\n" +
                    "  |____V|\n";

        } else if (diceRoll == 3) {
            return "   _____\n" +
                    "  |3    |\n" +
                    "  | o o |\n" +
                    "  |     |\n" +
                    "  |  o  |\n" +
                    "  |____E|\n";

        } else if (diceRoll == 4) {
            return "   _____\n" +
                    "  |4    |\n" +
                    "  | o o |\n" +
                    "  |     |\n" +
                    "  | o o |\n" +
                    "  |____h|\n";

        } else if (diceRoll == 5) {
            return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

        } else if (diceRoll == 6) {
            return "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

        } else if (diceRoll == 7) {
            return "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

        } else if (diceRoll == 8) {
            return "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

        } else if (diceRoll == 9) {
            return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

        } else if (diceRoll == 10) {
            return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

        } else if (diceRoll == 11) {
            return "   _____\n" +
                    "  |J  ww|\n" +
                    "  | o {)|\n" +
                    "  |o o% |\n" +
                    "  | | % |\n" +
                    "  |__%%[|\n";

        } else if (diceRoll == 12) {
            return "   _____\n" +
                    "  |Q  ww|\n" +
                    "  | o {(|\n" +
                    "  |o o%%|\n" +
                    "  | |%%%|\n" +
                    "  |_%%%O|\n";

        } else if (diceRoll == 13) {
            return "   _____\n" +
                    "  |K  WW|\n" +
                    "  | o {)|\n" +
                    "  |o o%%|\n" +
                    "  | |%%%|\n" +
                    "  |_%%%>|\n";

        }

        return "";

    }

    /**
     * Task 1
     * 
     * Function name – randomCard
     * 
     * @return (String)
     * 
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card that matches the random number (get the String
     *         values from cards.text).
     */
}