package org.example.homework160224;

public class Book {
    private String name;
    private int yearOfProduction;

    public Book(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
