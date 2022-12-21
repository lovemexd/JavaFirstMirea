package ru.mirea.task3;

public class Circle {
    private double radius;
    private double diameter;

    private double square;

    private double squareLength;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "\n[Circle]" +
                "\nradius: " + radius +
                "\ndiameter: " + findDiameter() +
                "\nsquare: " + findSquare() +
                "\nsquareLength: " + findSquareLength() +
                "\n";
    }

    public Double findDiameter() {
        diameter = radius * 2;

        return diameter;
    }

    public Double findSquare() {
        square = 3.14 * (radius * radius);

        return square;
    }

    public Double findSquareLength() {
        squareLength = 2 * 3.14 * radius;

        return squareLength;
    }
}
