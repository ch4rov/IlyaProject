package YouTubeLessons;
import java.util.Scanner;

public class Switch {
    public static void main (String [] args){
        System.out.println("Enter your age");
        Scanner userEntryAge = new Scanner(System.in);
        byte byteScannerUserAge = userEntryAge.nextByte();
        switch (byteScannerUserAge){
            case 0 :
                System.out.println("0");
                break;
            case 6:
                System.out.println("6");
                break;
            case 18 :
                System.out.println("18");
                break;
            default:
                System.out.println("Other.");
        }
    }
}
