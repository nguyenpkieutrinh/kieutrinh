package Exercise1;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add new book");
            System.out.println("2. Update book by ID");
            System.out.println("3. Delete book by ID");
            System.out.println("4. Find book by ID");
            System.out.println("5. Display all books");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book type (1: TextBook, 2: ReferenceBook): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book ID: ");
                    String ID = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter unit price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    double quantity = scanner.nextDouble();

                    if (type == 1) {
                        scanner.nextLine();
                        System.out.print("Enter status: ");
                        String status = scanner.nextLine();
                        TextBook tb = new TextBook(ID , publisher, new Date(), price, quantity, status);
                        bookList.addBook(tb);
                    } else if (type == 2) {
                        System.out.print("Enter tax: ");
                        double tax = scanner.nextDouble();
                        ReferenceBook rb = new ReferenceBook(ID, publisher, new Date(), price, quantity, tax);
                        bookList.addBook(rb);
                    }
                    break;
                case 2:
                    System.out.print("Enter the ID of the book to update: ");
                    String updateId = scanner.nextLine();
                    bookList.updateBook(updateId);
                    break;
                case 3:
                    System.out.print("Enter the ID of the book to delete: ");
                    String deleteId = scanner.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 4:
                    System.out.print("Enter the ID of the book to find: ");
                    String findId = scanner.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) {
                        foundBook.displayBook();
} else {
                        System.out.println("No book found with ID: " + findId);
                    }
                    break;
                case 5:
                    bookList.displayAllBooks();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}