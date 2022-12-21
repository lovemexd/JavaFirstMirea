package ru.mirea.task3;

public class Book {
    private String name;
    private String genre;
    private String author;
    private int year;
    private int countPages;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getCountPages() {
        return countPages;
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
