package ru.mirea.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    private int getFactorial(int num) {
        if (num <= 0) return 1;
        return getFactorial(num - 1) * num;
    }
    public static void main(String[] args) {
        System.out.print("Введите число для подсчета его факториала: ");
        Scanner scanner = new Scanner(System.in);
        int num;
        Factorial example = new Factorial();
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.print("Ввод должен быть числом!");
            return;
        }
        if (num > 0) {
            System.out.printf("Факториал числа %d = %d", num, example.getFactorial(num));
        } else
            System.out.print("Ошибка! Вводимое число должно быть > 0");
    }
}
