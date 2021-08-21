package com.codecool.library;

public class SoftCoverBook extends Book {


    public SoftCoverBook(int pages, String author, String title, int year) {
        super(pages, author, title, year);
    }

    @Override
    public String toString() {
        return "SoftCoverBook{" +
                "pages=" + pages +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
