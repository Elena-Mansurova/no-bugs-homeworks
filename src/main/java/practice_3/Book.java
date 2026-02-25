package practice_3;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void printInfo() {
        System.out.println("Author: " + getAuthor() + ", title: " + getTitle());
    }
}
