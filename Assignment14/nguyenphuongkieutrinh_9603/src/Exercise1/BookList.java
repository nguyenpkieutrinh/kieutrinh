
package Exercise1;
import java.util.ArrayList;
public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {
        bookList.add(book);
    }

    // Update a book by ID
    public void updateBook(String ID) {
        for (Book book : bookList) {
            if (book.getBookID().equals(ID)) {
                book.updateBook(ID);
                return;
            }
        }
        System.out.println("No book found with ID: " + ID);
    }

    // Delete a book by ID
    public void deleteBookById(String ID) {
        bookList.removeIf(book -> book.getBookID().equals(ID));
    }

    // Find a book by ID
    public Book findBookById(String ID) {
        for (Book book : bookList) {
            if (book.getBookID().equals(ID)) {
                return book;
            }
        }
        return null;
    }

    // Display all books
    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayBook();
            System.out.println("------");
        }
    }

}
