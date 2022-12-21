package ru.mirea.task6;

public class Planets implements Nameable{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Planets earth = new Planets();

        earth.setName("Mars");

        System.out.print("Planet's name: " + earth.getName());
    }
}