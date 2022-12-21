package ru.mirea.task6;

public class Phone implements Priceable{

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        Phone phone = new Phone();

        phone.setPrice(139.99);

        System.out.print("Phone's price: " + phone.getPrice() + '$');
    }
}