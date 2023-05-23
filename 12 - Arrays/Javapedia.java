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
            for(int j =0; j<arrays[i].length;j++){
                if(j==0) {
                    System.out.print("\t - Name: ");
                    String name = scan.nextLine();
                    arrays[i][j]= name; 
                }
                else if(j==1){
                    System.out.print("\t - Date of birth: ");
                    String date = scan.nextLine();
                    arrays[i][j]= date;

                }
                else if(j==2){
                    System.out.print("\t - Occupation: ");
                    String occu = scan.nextLine(); 
                     arrays[i][j]= occu;

                }
                   
                    
                }

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
        
        String search =scan.nextLine(); 
        for(int i =0; i<arrays.length;i++ ){
            System.out.print("\t");
            for (int j = 0;j<arrays[i].length;j++){
                System.out.println(arrays[i][0]);
                if(search.equals(arrays[i][0])){
                    System.out.print( "\tName:" + arrays[i][j]) ;
                    System.out.print("\tDate of birth:" + arrays[i][j+1]); 
                    System.out.print("\tOccu:" + arrays[i][j+2]); 

                    
                }
                else{
                    continue;
                }
            }
        }
        

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
        for(int i =0; i<arrays.length;i++ ){
            System.out.println("\t");
            for (int j = 0;j<arrays[i].length;j++){
                System.out.print(arrays[i][j]+" ");
            }
        }
        
     }

}
    
