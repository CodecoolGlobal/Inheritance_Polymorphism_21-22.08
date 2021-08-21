package com.codecool.library;

public class Library {

    private Book[] shelf;
    private int shelfSize;
    private int lastBookIndex;

    public Library(int shelfSize) {
        shelf = new Book[shelfSize];
        this.shelfSize = shelfSize;
        lastBookIndex = -1;
    }

    public Book[] getShelf() {
        return shelf;
    }

    public void addBook(Book book) {
        if (lastBookIndex < shelfSize - 1) {
            lastBookIndex++;
            shelf[lastBookIndex] = book;
        }
    }
}
