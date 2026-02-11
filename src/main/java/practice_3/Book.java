package practice_3;

public class Book {
    private String author;
    private String title;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    String getAuthor() {
        return this.author;
    }

    String getTitle() {
        return this.title;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void printInfo() {
        System.out.println("Author: " + getAuthor() + ", title: " + getTitle());
    }
}
