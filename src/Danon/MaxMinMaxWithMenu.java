package Danon;
import java.util.Scanner;

public class MaxMinMaxWithMenu {
    public static void main(String[] args) {
        int[] massive = new int[3];
        boolean exit = true;
        while (exit) {
        showMenu();
        Scanner chooseInMenu = new Scanner(System.in);
        byte menuChoose = chooseInMenu.nextByte();
        switch (menuChoose) {
            case 1:
                for (int i = 0; i <= 2; i++) {
                    System.out.print("Entry " + (i + 1) + " value: ");
                    Scanner digit = new Scanner(System.in);
                    massive[i] = digit.nextInt();
                }
                break;
            case 2:
                System.out.println(getMax(massive));
                break;
            case 3:
                System.out.println(getMin(massive));
                break;
            case 4:
                System.out.println(getAvg(massive));
                break;
            case 0:
                System.out.println("\u001B[30m" + "Exit from program." + "\u001B[0m");
                exit = false;
                break;
            default:
                System.out.println("\u001B[31m" + "You entry wrong digit, try again." + "\u001B[0m");
        }}
    }

    public static void showMenu(){
        System.out.println();
        System.out.println("===USER MENU===");
        System.out.println("1 = Enter digits");
        System.out.println("2 = Out maximum of digits");
        System.out.println("3 = Out minimum of digits");
        System.out.println("4 = Out average of digits");
        System.out.println("0 = Exit from program");
        System.out.print("Entry digit to continue: ");
    }

    private static int getMax(int[] massive){
        int max = massive[0];
        for (int i = 1; i < massive.length; i++){
            if (massive[i] > max) {
                max = massive[i];
            }
        } return max;
    }
    public static int getMin(int[] massive){
        int min = massive[0];
        for (int i = 1; i < massive.length; i++){
            if (massive[i] < min) {
                min = massive[i];
            }
        } return min;
    }
    public static int getAvg(int[] massive){
        int sum = 0;
        for (int i = 0; i <= (massive.length-1); i++){
            sum = sum + massive[i];
        } return (sum / massive.length);
    }
}

