package Habr440436.Main;
/* Задача: Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1]. */

import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
        int[] massive = new int[3];

        /* 1- переписать, чтобы числа считывались с консоли
        // 2 - создать меню, чтобы 1 было ввод числа 2 макс 3 мин 4 сред взависимости от выбора
        // добавить методы а не просто выводы
        System.out.println("Entry three digits for continue..");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

     Scanner amountScanner = new Scanner(System.in);
        int amount = amountScanner.nextInt(); */
        Scanner menuDigit = new Scanner(System.in);
        int inSwitch = menuDigit.nextInt();

        switch (inSwitch) {
            case 1:
                System.out.println("Enter three digits: ");
                for (int i = 0; i <= 2; i++) {
                    Scanner digit = new Scanner(System.in);
                    massive[i] = digit.nextInt();
                }

            case 2:

            case 3:

            case 4:

            case 0:

            default:
                return;
        }


    }


    //  public int getMaximum(massive[0], massive[1], massive[2]){
//
//        }

//        // Максимальное значение чисел
//        System.out.println("Max value: " + Math.max(massive[0], Math.max(massive[1], massive[2])));
//
//        System.out.println();
//
//        // Минимальное значение
//        System.out.println("Min value: " + Math.min(massive[0], Math.min(massive[1], massive[2])));
//
//        System.out.println();
//
//        // Среднее значение
//        System.out.println("Avg value: " + (massive[0] + massive [1] + massive[2])/3);

}
