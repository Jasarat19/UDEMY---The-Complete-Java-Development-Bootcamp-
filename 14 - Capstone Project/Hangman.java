import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

public class Hangman {
    static Scanner scan = new Scanner(System.in);
    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = drawRandomCard(words.length);
        // String randWord = words[randomNumber];
        String randWord = "HA";
        char[] misses = new char[6];
        char[] randomWords = new char[randWord.length()];
        System.out.println(gallows[0]);
        System.out.print("Words:   ");
        for (int i = 0; i < randWord.length(); i++) {
            randomWords[i] = '_';
            System.out.print(randomWords[i] + " ");
        }
        System.out.print("\n\nMisses:   ");
        int count = 0;

        while (count < 6) {

            System.out.print("\n\nGuess :   ");
            char guess = scan.next().charAt(0);

            boolean isGuessedCorrectly = false;
            for (int i = 0; i < randWord.length(); i++) {

                if (guess == randWord.charAt(i)) {
                    randomWords[i] = randWord.charAt(i);
                    isGuessedCorrectly = true;
                    System.out.print(gallows[count]);

                }

            }

            if (isGuessedCorrectly == false) {
                misses[count] = guess;
                System.out.print(gallows[count + 1]);
                count++;
            }
            int point = 0;

            for (int i = 0; i < randWord.length(); i++) {
                if (randomWords[i] != '_') {
                    point++;
                }

            }
            printUI(randomWords, misses, point);

            if (point == (randWord.length())) {
                System.out.println("\nGood Work!");
                break;
            }

        }
        if (count >= 6) {
            System.out.println("\nYou lose");
            System.out.println("The word was " + words[randomNumber]);

        }

    }

    public static int drawRandomCard(int wordsLength) {
        return (int) (Math.random() * (wordsLength - 0 + 1) + 0);
    }

    public static void printUI(char[] randomWords, char[] misses, int point) {
        System.out.print("\n\nWords:   ");
        for (int i = 0; i < randomWords.length; i++) {
            System.out.print(randomWords[i] + " ");
        }
        if (point != randomWords.length) {
            System.out.print("\n\nMisses:   ");

            for (int i = 0; i < misses.length; i++) {
                System.out.print(misses[i]);
            }
        }

    }

}
