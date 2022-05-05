package Interfaces;

public class AA_Main {
    public static void main(String[] args) {
        Animal AnimalOne = new Animal(1);
        Person PersonOne = new Person("Alex");
        AnimalOne.showInfo();
        PersonOne.showInfo();


        /* ====== */
        System.out.println();
        // Interface "Info"
        Info infoOne = new Animal(2);
        Info infoTwo = new Person("Bob");
        infoOne.showInfo();
        infoTwo.showInfo();

    }
}
