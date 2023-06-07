import java.util.Scanner;
public class Workbook52 {
    public static void main(String[] args) {

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        
        for(int i = 1; i<100; i++){
            System.out.println(i+ ". " +line);
        } 


        
        
    }
}