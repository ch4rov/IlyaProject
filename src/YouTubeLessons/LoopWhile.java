package YouTubeLessons;
import java.util.Scanner;

public class LoopWhile {
    public static void main (String [] args) {
        System.out.println("Entry digit from 0 to 99..");
        Scanner ScannerLoopWhile = new Scanner(System.in);
        byte byteScannerLoopWhile = ScannerLoopWhile.nextByte();
        System.out.println("You entry "+byteScannerLoopWhile+".");
        while (byteScannerLoopWhile<=99){
            byteScannerLoopWhile++;
            System.out.println("Now your digit = "+byteScannerLoopWhile+".");
        }
    }
}
