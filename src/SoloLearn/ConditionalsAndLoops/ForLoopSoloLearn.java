package SoloLearn.ConditionalsAndLoops;
import java.util.Scanner;

public class ForLoopSoloLearn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of how many time loop will be repeat: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Welcome " + i);
        }
    }
}

