package ru.mirea.task1;

public class Harmonic {
    private int[] harmonicArr(){
        int[] arr = new int[10];
        arr[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    private void printArr(int[]arr) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1)
                System.out.print("1");
            else
                System.out.print(" + 1/" + arr[i]);
        }
    }
    public static void main(String[] args) {
        Harmonic example = new Harmonic();
        System.out.print("Первые 10 чисел гармонического ряда: ");
        example.printArr(example.harmonicArr());
    }
}
