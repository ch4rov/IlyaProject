package Danon.Task2;
import java.util.Scanner;

public class StudentsTeachers extends Metods {

    public void studentsMenu(){
        int i = 0;
    boolean exit = true;
        while (exit) {
            showMenu();
            Scanner chooseInMenu = new Scanner(System.in);
            byte menuChoose = 0;
            try { menuChoose = chooseInMenu.nextByte(); } catch (Exception e) { menuChoose = 99; }
            switch (menuChoose) {
                case 1:
                    ++i;
                    addPerson(i);
                    break;
                case 2:
                    if (MapList.isEmpty()) {
                        System.out.println("No one find, try to add person");
                    } else { editPerson(); }
//                        boolean exitFromEditMenu = true;
//                        while (exitFromEditMenu) {
//                            showEditPersonMenu();
//                            Scanner chooseInEditMenu = new Scanner(System.in);
//                            byte menuEditChoose = 0;
//                            try {
//                                menuEditChoose = chooseInEditMenu.nextByte();
//                            } catch (Exception e) {
//                                menuEditChoose = 99;
//                            }
//                            switch (menuEditChoose) {
//                                 // case 1 -> editFirstNameOfPerson();
//                                 // case 2 -> editSecondNameOfPerson();
//                                case 0 -> {
//                                    System.out.println("\u001B[30m" + "Exit to menu." + "\u001B[0m");
//                                    exitFromEditMenu = false;
//                                }
//                                default -> System.out.println("\u001B[31m" + "You entry wrong digit, try again." + "\u001B[0m");
//                            }
//                        }
                    break;
                case 3:
                    removePerson();
                    break;
                case 4:
                    if (MapList.isEmpty()) {
                        System.out.println("No one find, try to add person");
                    } else {
                    showAllInfo();}
                    break;

                case 0:
                    System.out.println("\u001B[30m" + "Exit from program." + "\u001B[0m");
                    exit = false;
                    break;
                default:
                    System.out.println("\u001B[31m" + "You entry wrong digit, try again." + "\u001B[0m");
            }
        }
    }}