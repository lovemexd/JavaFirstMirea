package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setRadius(5);
        System.out.print("Cicrle Radius: " + circle.getRadius());

        System.out.print("\nCircle Diameter: " + circle.findDiameter());
        System.out.print("\nCicrle Square: " + circle.findSquare());
        System.out.print("\nCircle Square Length: " + circle.findSquareLength());

        System.out.print("\n" + circle.toString());
    }
}
