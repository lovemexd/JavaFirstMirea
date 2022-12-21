package ru.mirea.task5;

public abstract class Dog {
    protected String name;
    protected int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String letOutBark();
}

class Husky extends Dog {
    private String breed;

    Husky(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String letOutBark() {
        return "Dog barked!";
    }
}

class Alabai extends Dog {
    private String breed;

    Alabai(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String letOutBark() {
        return "Dog barked!";
    }
}
