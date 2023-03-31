import java.util.Scanner;

public class Survey {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("What is your name");
        String name = sc.nextLine();
        
        System.out.println("What is price");
        double value = sc.nextDouble();
        sc.close();

    }
    
}
