package SoloLearn.ConditionalsAndLoops;
import java.util.Scanner;

public class Task1_Complete {
    public static void main(String[] args) {
        Scanner amountScanner = new Scanner(System.in);
        int amount = amountScanner.nextInt();
        for (int i = 0; i < 3; i++){
            amount = amount * 9/10;
            System.out.println(i + " " + amount);
        }
        System.out.println("Answer " + amount);
    }
}
