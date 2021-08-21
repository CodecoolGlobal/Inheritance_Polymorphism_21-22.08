package com.codecool.library;

public class HardCoverBook extends Book {

    private boolean isBookmark;
    private int bookmarkAtPage;

    public HardCoverBook(int pages, String author, String title, int year, boolean isBookmark) {
        super(pages, author, title, year);

        this.isBookmark = isBookmark;
        this.bookmarkAtPage = 0;
    }


    public void setBookmarkAtPage(int bookmarkAtPage) {
        this.bookmarkAtPage = bookmarkAtPage;
    }

    @Override
    public String toString() {
        return "HardCoverBook{" +
                "pages=" + pages +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", isBookmark=" + isBookmark +
                ", bookmarkAtPage=" + bookmarkAtPage +
                '}';
    }
}
