package Habr440436.Main;
/* Задача: Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1]. */

public class MaxMinAvg {
    public static void main(String[] args) {
        int[] massive = {22, 33, 44};

        // Максимальное значение чисел
        System.out.println("Max value: " + Math.max(massive[0], Math.max(massive[1], massive[2])));

        System.out.println();

        // Минимальное значение
        System.out.println("Min value: " + Math.min(massive[0], Math.min(massive[1], massive[2])));

        System.out.println();

        // Среднее значение
        System.out.println("Avg value: " + (massive[0] + massive [1] + massive[2])/3);

    }
}