package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", HumanAge=" + toHumanAge() + "}";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge() {
        int humanAge = age * 7;

        return humanAge;
    }
}
