package Exercise1;

import java.util.Date;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }
    public double getTax() {
       return tax;
   }
   
   public void setStatus(String status) {
       this.tax = tax;
   }
   
   @Override
   public void addBook() {
       System.out.println("Add a new ReferenceBook");
   }
   
   @Override
   public void updateBook(String id){
       if(getBookID().equals(id)){
           System.out.println("Update the ReferenceBook with ID: " + id);
       }
   }
   
   @Override
   public void displayBook() {
       System.out.println("ReferenceBook Information: ");
       System.out.println("ID: " + getBookID());
       System.out.println("Publisher: " + getPublisher());
       System.out.println("Tax: " + tax);
   }
}
