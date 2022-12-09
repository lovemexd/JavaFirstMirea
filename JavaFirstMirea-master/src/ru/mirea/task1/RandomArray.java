package ru.mirea.task1;

import java.util.Random;
public class RandomArray {
    private int[] generateWithMath(){
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }

        return arr;
    }

    private int[] generateWithRandom(){
        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }

    private void print(int[] arr){
        for (int i : arr)
            System.out.printf("%d ", i);
    }
    public static void main(String[] args) {
        RandomArray example = new RandomArray();
        System.out.print("Массив, сгенерированный с помощью класса Math: ");
        example.print(example.generateWithMath());
        System.out.print("\nМассив, сгенерированный с помощью Random: ");
        example.print(example.generateWithRandom());
    }
}
