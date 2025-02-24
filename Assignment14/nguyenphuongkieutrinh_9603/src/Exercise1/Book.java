package Exercise1;

import java.util.Date;

public abstract class Book implements IBook {

    String bookID;
    String publisher;
    Date entryDate;
    double unitPrice;
    private double quantity;

    public Book(String bookID, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID (String bookID) {
        this.bookID = bookID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    @Override
    public abstract void addBook();
    @Override
    public abstract void updateBook(String ID);
    @Override
    public abstract void displayBook();
}
