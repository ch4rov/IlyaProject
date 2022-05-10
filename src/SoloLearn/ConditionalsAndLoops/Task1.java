//Loan Calculator
//
//        You take a loan from a friend and need to calculate how much you will owe him after 3 months.
//        You are going to pay him back 10% of the remaining loan amount each month.
//        Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
//
//        Sample Input:
//        20000
//
//        Sample Output:
//        10628
//
//        Here is the monthly payment schedule:
//        Month 1
//        Payment: 10% of 20000 = 2000
//        Remaining amount: 18000
//        Month 2
//        Payment: 10% of 18000 = 1800
//        Remaining amount: 16200
//        Month 3:
//        Payment: 10% of 16200 = 1620
//        Remaining amount: 14580
//        Use a loop to calculate the payment and remaining amounts for each month.
//        Also, use integers for amounts.

// 1. Инициализациия счетчика, которая меняется с каждой операцией цикла
// 2. Блок условия: до какого момента будет исполняться цикл
// 3. Какое действие будет выполняться каждый раз проходя через цикл
package SoloLearn.ConditionalsAndLoops;

public class Task1 {
    public static void main(String[] args) {
        double amount = 20000;
        for (int i = 0;i<=12;i++){
            amount = amount - (amount * 0.10);
            System.out.println(i + " "+amount);
        }
    }
}
//public class Task1 {
//    public static void main(String[] args) {
//        double input = 20000;
//        double percent = 0.10;
//        double data1 = input * percent;
//        double output1 = input - data1;                            // 20000-2000 = 18000
//        //
//
//        double data2 = output1 * percent;                        // 18000-1800=16200
//        double output2 = output1 - data2;
//        //
//
//        double data3 = output2 * percent;                          // 16200-1620=14580
//        double output3 = output2 - data3;
//
//        System.out.println("Input: " + input);
//        System.out.println("Output1: " + output1);
//        System.out.println("Output2: " + output2);
//        System.out.println("Output3: " + output3);
//
//    }
//}
