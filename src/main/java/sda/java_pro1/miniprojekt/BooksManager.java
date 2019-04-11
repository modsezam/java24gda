package sda.java_pro1.miniprojekt;

import sda.java_pro1.miniprojekt.books.Book;
import sda.java_pro1.miniprojekt.books.BookType;

import java.util.ArrayList;
import java.util.List;

public class BooksManager {


    private List<Book> books;

    public BooksManager() {
        books = createBooks();
    }

    public List<Book> findBooks() {
        return books;
    }

    public void addBook(String author, String title, BookType type) {
        books.add(new Book(author, title, type));
    }

    public boolean deleteBook(int bookId) {

        books.remove(bookId - 1);

        return true;
    }

    public List<Book> getSortedByAuthor() {
        return books;
    }

    public List<Book> getSortedByType() {
        return books;
    }

    private List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Henryk Sienkiewicz", "Ogniem i mieczem", BookType.HISTORICAL));
        books.add(new Book("Juliusz Słowacki", "Balladyna", BookType.DRAMA));
        books.add(new Book("Agatha Cristie", "Morderstwo w Orient Expressie", BookType.DETECTIVE_STORY));
        books.add(new Book("Agatha Cristie", "Śmierć na Nilu", BookType.DETECTIVE_STORY));
        books.add(new Book("Juliusz Słowacki", "Oda do wolności", BookType.POETRY));
        books.add(new Book("Henryk Sienkiewicz", "Quo vadis", BookType.HISTORICAL));
        books.add(new Book("Norman Davies", "Boże igrzysko. Historia Polski", BookType.HISTORICAL));

        return books;
    }
}