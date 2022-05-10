//        You're a tour manager and need a program that will identify small countries.
//        A country is considered small if its population is under 10000 and its area is under 10000 hectares.
//        The given program takes population and area as input.
//
//        Task
//        Complete the program to output "small country" if both conditions are met. Don't output anything otherwise.

package SoloLearn.ConditionalsAndLoops;

// import java.util.Scanner;

import java.io.PrintStream;
import java.time.DayOfWeek;
import java.util.Scanner;

public class LogicalStatements {
    public static void main(String[] args) {
        // Scanner read = new Scanner(System.in);
        int int1 = 9955;
        int int2 = 7522;
        if (int1 < 10000 && int2 < 10000){ // && - AND
            System.out.println("Small country");
        }
        System.out.println();
        int int3 = 5003;
        if (int3 < 5000 || int3 > 5005){
            System.out.println(int3 +" < 5000 OR "+ int3+ " > 5005"); // False
        } else {
            System.out.println("int3 = \""+int3+"\""+ " > 5000 u < 5005");
        }
        // ========= //
        Scanner switchScanner = new Scanner(System.in);
        System.out.println("Enter digit from 1 to 7");
        byte byteSwitchScanner = switchScanner.nextByte();
        byte dataByteSwitchScanner = --byteSwitchScanner;
        switch(dataByteSwitchScanner){
            case 0 :
                System.out.println("Monday");
                break;
            case 1 :
                System.out.println("Tuesday");
                break;
            case 2 :
                System.out.println("Wednesday");
                break;
            case 3 :
                System.out.println("Thursday");
                break;
            case 4 :
                System.out.println("Friday");
                break;
            case 5 :
                System.out.println("Saturday");
                break;
            case 6 :
                System.out.println("Sunday");
                break;
        }

        // ================ //
        Scanner ScannerGradeCount = new Scanner(System.in);
        System.out.println("");
        byte gradeCount = ScannerGradeCount.nextByte();
        String grade = switch (gradeCount){
        case 1,2,3,4 -> "раз 4";
        case 5,6,7,8,9 -> "1-9";
            default -> "10-11";
        };
        System.out.println(grade);
    }
}
