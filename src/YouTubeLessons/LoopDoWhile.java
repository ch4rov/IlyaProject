package YouTubeLessons;
import java.util.Scanner;

public class LoopDoWhile {
    public static void main (String [] args){
        final short RightPassword = 1234;
        Scanner ScanEnterCode = new Scanner(System.in);
        short UserEntryCode;
        do {
            System.out.println("Enter digital password (4 digit)");
            UserEntryCode = ScanEnterCode.nextShort();
        } while (RightPassword != UserEntryCode);
        System.out.println("You enter right code.");
    }
}
