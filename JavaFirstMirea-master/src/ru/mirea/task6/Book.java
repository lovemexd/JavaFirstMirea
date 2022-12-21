package ru.mirea.task6;

public class Book implements Priceable{

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        Book book = new Book();

        book.setPrice(7.99);

        System.out.print("Book price: " + book.getPrice() + '$');
    }
}