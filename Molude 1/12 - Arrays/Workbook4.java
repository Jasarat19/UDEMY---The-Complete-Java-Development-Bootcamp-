import java.util.*;
public class Workbook4 {
    public static void  main (String [] args ){
        Scanner sc =new Scanner(System.in);
           

           
            System.out.println("Welcome to Java Grocers. What can I help you find?");
            String food = sc.nextLine();

            String [] store ={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
            for(int i=0 ; i< store.length; i++){
                if(store[i].equals(food)){
                    System.out.println("\nWe have that in aisle: " + i );
                    break;
                }
            }
    
            }
          
    }
    

