import java.util.Random;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        randomCard(1,13);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */

        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

         scan.close();
    }
    public static String randomCard(int min , int max) {
        int diceRoll = (int) (Math.random() * (max - min + 1) + min);
        if(diceRoll=1){
            return
                
            " 1:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }
        else if(diceRoll=2){
            return
            " 2:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }
        else if(diceRoll=3){
            return
                
            " 3:" +
            "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n" ;
             
        }
        else if(diceRoll=4){
            return
                
           "4:" +
           "   _____\n" +
           "  |4    |\n"+
           "  | o o |\n"+
           "  |     |\n"+
           "  | o o |\n"+
           "  |____h|\n" ;
             
        }
        else if(diceRoll=5){
            return
                
            " 5:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }
        else if(diceRoll=6){
            return
                
            " 6:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }
        else if(diceRoll=7){
            return
                
            "7 :" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }
        else if(diceRoll=8){
            return
                
            "8:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }else if(diceRoll=9){
            return
            " 9:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }else if(diceRoll=10){
            return
                
            " 10:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }else if(diceRoll=11){
            return
                
            " 11:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }else if(diceRoll=12){
            return
                
            " 12:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }else if(diceRoll=13){
            return
            " 13:" +
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n" ;
             
        }






        return "" ;

    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
}