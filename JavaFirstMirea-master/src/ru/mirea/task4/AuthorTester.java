package ru.mirea.task4;

public class AuthorTester {
    public static void main(String[] args) {
        Author author = new Author("Popov Fedor", "ffa2004ffa@mail.ru", 'm');
        System.out.println(author);
        author.setEmail("12345xd@mail.ru");
        System.out.println(author.getEmail());
    }
}
