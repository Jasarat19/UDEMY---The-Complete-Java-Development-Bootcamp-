
public class Workbook5 {
    public static void main(String[] args) {

        int firstNumber = randomNumber();
        int secondNumber = randomNumber();
        int thirdNumber = randomNumber();
        int forthNumber = randomNumber();
        int fifthNumber = randomNumber();
        int sixthNumber = randomNumber();
        int seventhNumber = randomNumber();
        int eighthNumber = randomNumber();
        int ninthNumber = randomNumber();
        int tenthNumber = randomNumber();

        int highScore = 0;

       
        // int [] numberTwo = new int[10];
        // numberTwo[0]=2;
        // numberTwo[6]=7;
        // for (int i=0; i < 10; i++) {
        //     if (i==6 || i==0) {
            
        //         continue;
        //     }
        //     numberTwo[i] = randomNumber();


        // }


        // System.out.println("\n\nThe highest score is: " + highScore + ". Give that
        // man a cookie!");

        int[] number = { firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber, sixthNumber, seventhNumber,
                eighthNumber, ninthNumber, tenthNumber};
         
                System.out.print("Here are the scores: ");
                for(int i=0; i<10;i++){
                    System.out.print(number[i] + " ");
                }

                for(int i=0 ;i < number.length; i++) {
                    if(highScore<number[i]) {
                        highScore = number[i];
                    }
                    
                }
                System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    public static int randomNumber() {

        return (int) (Math.random() * 49999 + 1);

    }

}
