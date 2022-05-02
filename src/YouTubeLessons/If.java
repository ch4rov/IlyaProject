package YouTubeLessons;
import java.util.Scanner;

public class If {
    public static void main (String [] args){
        System.out.println("Enter any age (1-120)");
        Scanner ScannerIf = new Scanner(System.in);
        byte byteScannerIf = ScannerIf.nextByte();
        if (byteScannerIf == 0) {
            System.out.println("Ваш возвраст не может ровняться нулю.");
        }  else if (byteScannerIf <= 6){
            System.out.println("Указано до 6ти лет включительно.");
        } else if (byteScannerIf <= 16) {
            System.out.println("Указано до 16ти лет включительно.");
        } else if (byteScannerIf <= 120) {
            System.out.println("Указано до 120 лет включительно.");
        } else {
            System.out.println("Вы указали неверный возвраст.");
        }
    }
}

