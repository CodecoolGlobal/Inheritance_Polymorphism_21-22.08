package com.codecool.library;

public class Book {

    protected int pages;
    protected String author;
    protected String title;
    protected int year;

    public Book(int pages, String author, String title, int year) {
        this.pages = pages;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Author = "+author + ", title = " + title + ", year = "+ year + ", pages = "+ pages;
    }
}
