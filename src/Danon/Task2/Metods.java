package Danon.Task2;
import java.util.InputMismatchException;
import java.util.Map;
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

    /* public void showEditPersonMenu() {
        System.out.println();
        System.out.println("What you wanna edit?");
        System.out.println("1 = First name");
        System.out.println("2 = Second name");
        System.out.println("0 = Back to menu");
        System.out.print("Entry digit to continue: ");
    } */

    public void addPerson(int i) {
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
                        MapList.put(i, (getFirstName() + " " + getSecondName()));
                        checkSecondName = false;
                        checkFirstName = false;
                    }
                }
            }
        }
    }


    public void editPerson() {
        boolean checkID = true;
        while (checkID) {
            System.out.print("Entry person ID: ");
            Scanner scannerID = new Scanner(System.in);
            try { int ID = scannerID.nextInt();
                if (ID >= 1) {
                if (MapList.containsKey(ID)){
                    checkID = false;
                    System.out.println("\u001B[37m" + "You edit " + MapList.get(ID) + "\u001B[0m");
                    System.out.print("Now entry new first name of your person: ");
                    boolean checkEditFullName = true;
                    while (checkEditFullName) {
                        Scanner scannerFirstName = new Scanner(System.in);
                        setFirstName(scannerFirstName.nextLine());
                        if (getFirstName().isEmpty()) {
                            System.out.print("You enter empty first name, try again. Entry your new first name of your person: ");
                        } else {
                            System.out.println("You set first name ("+getFirstName()+") to your person.");
                            System.out.print("Now enter second name of your person: ");
                            boolean secondName = true;
                            while (secondName) {
                                Scanner scannerSecondName = new Scanner(System.in);
                                setSecondName(scannerSecondName.nextLine());
                                if(getSecondName().isEmpty()) {
                                    System.out.print("You enter empty second name, try again. Entry your new second name of your person: ");
                                } else {
                                    System.out.println("You set new second name ("+getSecondName()+") to your person.");
                                    MapList.put(ID, getFirstName() + " " + getSecondName());
                                    checkEditFullName = false;
                                    secondName = false;
                                }
                            }
                        }
                    }
                } else { System.out.println("You enter wrong ID"); }
                }} catch (InputMismatchException e) { System.out.println("You enter wrong ID"); }}


    }

//    public void editSecondNameOfPerson() {
//        System.out.print("Entry new second name of your person: ");
//        Scanner scannerSecondName = new Scanner(System.in);
//        boolean checkSecondName = true;
//        while (checkSecondName) {
//            setSecondName(scannerSecondName.nextLine());
//            if (getSecondName().isEmpty()) {
//                System.out.print("You enter empty name, try again. Entry your new second name of your person: ");
//            } else {
//                checkSecondName = false;
//                System.out.println("You set up new second name to your person.");
//            }
//        }
//    }

    public void showAllInfo() {
        if (MapList.isEmpty()) {
            System.out.println("Not found person. Try to add new.");
        } else {
            for (Map.Entry list : MapList.entrySet()) {
                System.out.println(list);
            }
        }
    }

    public void removePerson() {
        if (MapList.isEmpty()) {
            System.out.println("Not found anyone, try to add.");
        } else {
            System.out.print("Enter number of person, who you wanna delete: ");
            try {
                Scanner scannerDeleteUserID = new Scanner(System.in);
                int ID = scannerDeleteUserID.nextInt();
                MapList.remove(ID);
            } catch (InputMismatchException e) {
                System.out.println("You enter wrong number");
            }
        }
    }
}
