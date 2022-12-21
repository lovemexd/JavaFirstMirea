package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book();

        book.setName("The witcher lady of the lake");
        book.setGenre("Novel");
        book.setAuthor("Andrzej Sapkowski");
        book.setYear(2000);
        book.setCountPages(512);

        System.out.print(book.toString());
    }
}
