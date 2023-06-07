public class WholeNumbers {
    public static void main (String[] args){
        int numberOfFans = 5000;
        System.out.println("There are " + numberOfFans + " in the game. ");
        //int globalPopulation = 7000000000;
        //System.out.println("There are " + globalPopulation + " in the world ");
        //The literal 7000000000 of type int is out of range so cannot compile.
        //long globalPopulation = 7000000000;[WE SHOULD ADD AN L OR ELSE IT WONT RUN]
        //System.out.println("There are " + globalPopulation + " in the world ");
        long globalPopulation = 7000000000L;
        System.out.println("There are " + globalPopulation + " in the world ");


    }
}

