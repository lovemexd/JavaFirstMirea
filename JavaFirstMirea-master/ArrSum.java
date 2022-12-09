package ru.mirea.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrSum {
    private int sumFor(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private int sumDoWhile(int[] arr) {
        int sum = 0;
        int i = 0;

        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);

        return sum;
    }

    private int sumWhile (int[] arr) {
        int sum = 0;
        int i = 0;

        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        return sum;
    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int arrSize = scanner.nextInt();
            System.out.printf("Введите %d чисел: ", arrSize);
            int[] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = scanner.nextInt();
            }
            ArrSum example = new ArrSum();
            System.out.print("\n1. For");
            System.out.print("\n2. While");
            System.out.print("\n3. Do While");
            System.out.print("\nВыберите метод подсчёта: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.printf("Сумма с использованием цикла for: %d", example.sumFor(arr));
                case 2 -> System.out.printf("Сумма с использованием цикла while: %d", example.sumWhile(arr));
                case 3 -> System.out.printf("Сумма с использованием цикла do while: %d", example.sumDoWhile(arr));
            }
        }
        catch (InputMismatchException exception){
            System.out.print("Ввод должен быть числовой!");
        }
    }
}
