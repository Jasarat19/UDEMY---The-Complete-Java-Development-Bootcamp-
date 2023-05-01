import java.util.Scanner;

public class Workbook59 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Usename: ");
        String username = sc.nextLine();
        System.out.print("Password: ");


        String password = sc.nextLine();

        while (!username.equals("Samantha")  || !password.equals("Java") ) {

            System.out.println("incorrect");
            System.out.print("Usename: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();
        }
        System.out.println("Sign in successful. Welcome!");
    }

}
