package Interfaces;

public class AA_Main {
    public static void main(String[] args) {
        Animal A1 = new Animal(1);
        Person P1 = new Person("Alex");
        outputInfo(A1);
        outputInfo(P1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}