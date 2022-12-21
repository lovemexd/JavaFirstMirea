package ru.mirea.task5;

public class TesterDog {
    public static void main(String[] args) {

        Husky husky = new Husky("King", 3,
                "Husky");
        System.out.print("\nDog's Name: " + husky.getName());
        System.out.print("\nDog's Age: " + husky.getAge());
        System.out.print("\nDog's Breed: " + husky.getBreed());
        System.out.print("\n" + husky.letOutBark());

        Alabai alabai = new Alabai("Ron", 1,
                "Alabai");
        System.out.print("\n\nDog's Name: " + alabai.getName());
        System.out.print("\nDog's Age: " + alabai.getAge());
        System.out.print("\nDog's Breed: " + alabai.getBreed());
        System.out.print("\n" + alabai.letOutBark());
    }
}