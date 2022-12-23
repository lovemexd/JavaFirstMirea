package ru.mirea.task2;

public class Book {
    private String name;
    private String genre;
    private String author;
    private int year;
    private int countPages;

    public void setData(String name, String genre, String author, int year, int countPages) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.year = year;
        this.countPages = countPages;
    }

    public String toString() {
        return "\n[Book]" +
                "\nName of the Book: " + name +
                "\nGenre of the Book: " + genre +
                "\nAuthor of the Book: " + author +
                "\nYear of the Book: " + year +
                "\nCount of Book pages: " + countPages +
                "\n";
    }
}
