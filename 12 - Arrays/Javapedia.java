import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the u(ser: how many historical figures will you register?
        //       – Store the value.
        int figures = scan.nextInt();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        String [][] arrays = new String [figures][3] ;
        //Watch out for the nextLine() pitfall.
        scan.nextLine(); 
        // Task 3 
        for (int i =0; i<arrays.length; i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            String name = scan.nextLine();   

            System.out.print("\t - Date of birth: ");
            String date = scan.nextLine();

            System.out.print("\t - Occupation: ");
            String occu = scan.nextLine(); 

            System.out.print("\n");

        }
        
      
        System.out.println("These are the values you stored:"); 
        print2DArray(arrays);

        System.out.print("\nWho do you want information on? ");  
        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

   /*print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

     public static void print2DArray(String[][] arrays) {
        System.out.println( name + " "+ date + " "+ occu);
        
     }

}
    
