package ru.mirea.task4;

public class Author {
    private String name = "";
    private String email = "";
    private char gender = ' ';

    public Author(String name, String email, char gender){
        this.email = email;
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + " ("
                + gender + ") "
                + "at " + email;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
