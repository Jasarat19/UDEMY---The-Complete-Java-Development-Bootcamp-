import java.util.Scanner;


public class Modified {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("number between 1 to 5 : ");
        int n = sc.nextInt();
        
        

        int min = 1;
        int max = 5;

       int guess = guessNumber(min, max);
        while(n!=guess){
            
            System.out.println("Guess Again:" + guess);
             guess = guessNumber(min, max);
        }
        System.out.println("You got it");
    }
        public static int guessNumber(int min, int max) {
            
           return (int) (Math.random() * (max - min + 1) + min);
        }

            
        }
