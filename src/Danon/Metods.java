package Danon;
import java.util.Scanner;

public class Metods extends Students {
    public void showMenu() {
        System.out.println();
        System.out.println("=== USER MENU ===");
        System.out.println("1 = Add person");
        System.out.println("2 = Edit person");
        System.out.println("3 = Remove person");
        System.out.println("4 = Show all about person");
        System.out.println("0 = Exit from program");
        System.out.print("Entry digit to continue: ");
    }
    public void showEditPersonMenu() {
        System.out.println();
        System.out.println("What you wanna edit?");
        System.out.println("1 = First name (In developing);");
        System.out.println("2 = Second name (In developing);");
        System.out.println("0 = Back to menu;");
        System.out.print("Entry digit to continue: ");
 }

    public void addPerson() {
        System.out.print("Entry first name of your person: ");
        Scanner scannerFirstName = new Scanner(System.in);
        boolean checkFirstName = true;
        while (checkFirstName) {
            setFirstName(scannerFirstName.nextLine());
            if (getFirstName().isEmpty()) {
                System.out.print("You enter empty name, try again. Entry first name of your person: ");
            } else {
                boolean checkSecondName = true;
                System.out.print("Entry second name of your person: ");
                Scanner scannerSecondName = new Scanner(System.in);
                while (checkSecondName) {
                    setSecondName(scannerSecondName.next());
                    if (getSecondName().isEmpty()) {
                        System.out.print("You enter empty name, try again. Entry second name of your person: ");
                    } else {
                        list.add(getFirstName() + " " + getSecondName());
                        checkSecondName = false;
                        checkFirstName = false;
                    }
                }
            }
        }
    }


    public void editFirstNameOfPerson () {
        boolean checkID = true;
        while (checkID) {
                System.out.print("Entry person ID:");
                Scanner scannerID = new Scanner(System.in);
                int ID = scannerID.nextInt();
                if (ID <= list.size() && ID >= 0){
                    checkID = false;
                }
        }
        System.out.print("Entry new first name of your person: ");
        boolean checkFirstName = true;
        while (checkFirstName) {
            Scanner scannerFirstName = new Scanner(System.in);
            ////////////////////////////////////////////////////////////
            setFirstName(scannerFirstName.nextLine());
            if (getFirstName().isEmpty()) {
                System.out.print("You enter empty name, try again. Entry your new first name of your person: ");
            } else {
                System.out.println("You set new first name to your person.");
                checkFirstName = false;
            }
        }
    }

    public void editSecondNameOfPerson(){
        System.out.print("Entry new second name of your person: ");
        Scanner scannerSecondName = new Scanner(System.in);
        boolean checkSecondName = true;
        while (checkSecondName) {
            setSecondName(scannerSecondName.nextLine());
            if (getSecondName().isEmpty()) {
                System.out.print("You enter empty name, try again. Entry your new second name of your person: ");
            } else {
                checkSecondName = false;
                System.out.println("You set up new second name to your person.");
            }}}

    public void showAllInfo(){
        if (list.isEmpty()) {
            System.out.println("Not found person. Try to add new.");
        } else {
        long i = 1;
        for (String person: list) {
            System.out.println(i++ + ". " + person);
        }}
    }
    public void removePerson(){
        System.out.print("Enter number of person, who you wanna delete: ");
        Scanner scannerRemovePerson = new Scanner(System.in);
        int idList = scannerRemovePerson.nextInt() - 1;
        try { list.remove(idList); } catch (IndexOutOfBoundsException e) {
            System.out.println("Error when delete: " + e);
        }
    }

}
