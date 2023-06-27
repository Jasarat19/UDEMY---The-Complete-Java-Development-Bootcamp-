package Workbook5;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        int changeSeat = person.chooseSeat();
        person.setSeatNumber(changeSeat);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        //person.applyPassport();
        boolean apply = person.applyPassport();
        if (apply) {

            System.out.println("Congratulations Rayan Slim. Your passport was approved!");

        } else {
            System.out.println("We are sorry Rayan Slim. We cannot process your application.");

        }

    }

}