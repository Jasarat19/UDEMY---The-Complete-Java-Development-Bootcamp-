import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        // Task 3 – Wait for the user to press enter.
        scan.nextLine();
        // Task 4 – Get two random cards.
        int cardNumber1 = drawRandomCard();
        String randomCard1 = card(cardNumber1);
        int cardNumber2 = drawRandomCard();
        String randomCard2 = card(cardNumber2);
        // – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        System.out.println("\n You get a \n " + randomCard1 + "\n and a \n " + randomCard2);

        // Task 5 – Print the sum of your hand value.
        // – print: your total is: <hand value>
        int handValue = cardNumber1 + cardNumber2;
        System.out.println(" your total is:" + handValue);

        // Task 6 – Get two random cards for the dealer.
        // – Print: The dealer shows \n" + <first card> + "\nand has a card facing down
        // \n" + <facedown card>
        // – Print: \nThe dealer's total is hidden
        int dealerCardNumber1 = drawRandomCard();
        String dealerRandomCard1 = card(dealerCardNumber1);
        int dealerCardNumber2 = drawRandomCard();
        String dealerRandomCard2 = card(dealerCardNumber2);
        int dealerHandValue = dealerCardNumber1 + dealerCardNumber2;
        String hiddenCard = faceDown();

        System.out.println(
                "\n The dealer shows \n " + dealerRandomCard1 + "\n and has a card facing down \n " + hiddenCard);

        System.out.println("\nThe dealer's total is hidden");

        // Task 8 – Keep asking the player to hit or stay (while loop).
        // 1. Every time the player hits
        // – draw a new card.
        // – calculate their new total.
        // – print: (new line) You get a (new line) <show new card>.
        // - print: your new total is <total>

        // 2. Once the player stays, break the loop.

        while (true) {
            String option = hitOrStay();

            if (option.equals("hit")) {
                int value = drawRandomCard();
                String card = card(value);
                handValue = handValue + value;
                System.out.println("\n" + card);
                System.out.println("your new total is " + handValue);
                if (handValue > 21) {
                    System.out.println("Bust! Player loses");
                    return;
                }
            } else if (option.equals("stay")) {
                break;
            }
        }
        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are \n" + dealerRandomCard1 + "\n and a \n" + dealerRandomCard2);
        while (true) {
            int dealernewCardNumber = drawRandomCard();
            String dealernewcard = card(dealernewCardNumber);

            dealerHandValue = dealerHandValue + dealernewCardNumber;

            System.out.println("\n Dealer gets a \n" + dealernewcard + "\n Dealer's total is " + dealerHandValue);

            if (dealerHandValue >= 17) {
                break;
            }
        }

        if (dealerHandValue > 21) {
            System.out.println("Bust! Dealer loses");
        } else if (dealerHandValue > handValue) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("Player wins!");
        }

        // For tasks 9 to 13, see the article: Blackjack Part II.

        scan.close();

    }

    /**
     * Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     * 
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 13 + 1);
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */
    public static String card(int cardNumber) {
        if (cardNumber == 1) {
            return "   _____\n" +
                    "  |A _  |\n" +
                    "  | ( ) |\n" +
                    "  |(_'_)|\n" +
                    "  |  |  |\n" +
                    "  |____V|\n";

        } else if (cardNumber == 2) {
            return "   _____\n" +
                    "  |A _  |\n" +
                    "  | ( ) |\n" +
                    "  |(_'_)|\n" +
                    "  |  |  |\n" +
                    "  |____V|\n";

        } else if (cardNumber == 3) {
            return "   _____\n" +
                    "  |3    |\n" +
                    "  | o o |\n" +
                    "  |     |\n" +
                    "  |  o  |\n" +
                    "  |____E|\n";

        } else if (cardNumber == 4) {
            return "   _____\n" +
                    "  |4    |\n" +
                    "  | o o |\n" +
                    "  |     |\n" +
                    "  | o o |\n" +
                    "  |____h|\n";

        } else if (cardNumber == 5) {
            return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

        } else if (cardNumber == 6) {
            return "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

        } else if (cardNumber == 7) {
            return "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

        } else if (cardNumber == 8) {
            return "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

        } else if (cardNumber == 9) {
            return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

        } else if (cardNumber == 10) {
            return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

        } else if (cardNumber == 11) {
            return "   _____\n" +
                    "  |J  ww|\n" +
                    "  | o {)|\n" +
                    "  |o o% |\n" +
                    "  | | % |\n" +
                    "  |__%%[|\n";

        } else if (cardNumber == 12) {
            return "   _____\n" +
                    "  |Q  ww|\n" +
                    "  | o {(|\n" +
                    "  |o o%%|\n" +
                    "  | |%%%|\n" +
                    "  |_%%%O|\n";

        } else if (cardNumber == 13) {
            return "   _____\n" +
                    "  |K  WW|\n" +
                    "  | o {)|\n" +
                    "  |o o%%|\n" +
                    "  | |%%%|\n" +
                    "  |_%%%>|\n";

        }
        return "";

    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */

    public static String hitOrStay() {
        System.out.println("Please, enter hit or stay");

        while (true) {
            String option = scan.nextLine();
            if (!option.equals("hit") && !option.equals("stay")) {
                System.out.println("Please write 'hit' or 'stay'");

            } else {
                return option;
            }
        }
    }
}
