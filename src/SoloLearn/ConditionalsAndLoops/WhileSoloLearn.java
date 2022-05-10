package SoloLearn.ConditionalsAndLoops;
import java.util.Scanner;

public class WhileSoloLearn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter factorial: ");
        int number = scanner.nextInt();
        int fact = 1;
        while (number > 0) { fact *= number--; }
        System.out.println(fact);
        System.out.println("Factorial of "+number+ " is " + fact+".");
    }
} // factorial

