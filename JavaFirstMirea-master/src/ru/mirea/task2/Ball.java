package ru.mirea.task2;

public class Ball {
    private double diameter;
    private String color;

    public void setData(double diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }

    public String toString() {
        return "\n[Ball]" +
                "\nwidth: '" + diameter + '\''
                + "\ncolor: " + color + "\n";
    }
}
