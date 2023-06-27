import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        Person2 person = new Person2("Rayan Slim", "Canadian", "01/01/1111", 5);
        Person2 tahmid = new Person2("Rayan Slim", null, "01/01/1111", 5);


        // person.name = "Rayan Slim";
        // person.nationality = "Canadian";
        // person.dateOfBirth = "01/01/1111";
        // person.passport = new String[]{person.name, person.nationality,
        // person.dateOfBirth};
        // person.seatNumber = 5;

        System.out.println("Name: " + person.name + "\n" + "Nationality: "
               + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth +
               "\n" + "Seat Number: " + person.seatNumber + "\n");
               //System.out.println("babe");

    }

}