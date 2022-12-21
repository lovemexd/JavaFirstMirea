package ru.mirea.task6;

public class Animal  implements Nameable{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("Cat");
        System.out.print(animal.getName());
    }
}