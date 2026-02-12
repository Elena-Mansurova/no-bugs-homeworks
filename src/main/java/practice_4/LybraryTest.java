package practice_4;

import org.w3c.dom.ls.LSOutput;

public class LybraryTest {

    public static void main(String[] args) {
        Library book1 = new Library();

        // book1.bookTitle = "Home along";

        book1.author = "ngejrngkjbgr";
        book1.setAuthor("vbierhgiaurhg");

        book1.year = 1998;
        book1.setYear(2002);

        book1.category = "Thriller";
        book1.setCategory("Horror");

        System.out.println(book1.getYear() + "   " + book1.getAuthor() + "   " + book1.getCategory());

    }

}
