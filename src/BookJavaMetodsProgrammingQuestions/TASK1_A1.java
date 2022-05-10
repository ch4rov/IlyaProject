// Приветствовать любого пользователя при вводе его имени в строку в командной строке.
package BookJavaMetodsProgrammingQuestions;
import java.util.Scanner;

public class TASK1_A1 {
    public static void main(String[] args) {
        Scanner userNameScanner = new Scanner(System.in);
        System.out.print("Hello unknown user! Enter your name: ");
        String userName = userNameScanner.nextLine();
        System.out.println("Hello, "+ userName+"!");
    }
}
