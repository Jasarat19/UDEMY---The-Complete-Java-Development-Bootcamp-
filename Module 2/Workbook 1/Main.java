
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Person man = new Person();        
        man.name = "Rayan Slim";
        man.nationality = "Canadian";
        man.dateOfBirth = "01/01/1111";
    
        man.passport = new String[]{"Rayan Slim", "Canadian", "01/01/1111"};

        man.seatNumber = 5;

        System.out.println(man.name);
        System.out.println(man.nationality);
        System.out.println(man.dateOfBirth);
        System.out.println(Arrays.toString(man.passport));
        System.out.println(man.seatNumber);
    }
}
