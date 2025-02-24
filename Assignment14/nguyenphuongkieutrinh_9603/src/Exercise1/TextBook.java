
package Exercise1;

import java.util.Date;


public class TextBook extends Book {
    private String status;
    
    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status){
        super(bookId,publisher,entryDate,unitPrice,quantity );
        this.status = status;
    }
    
   public String getStatus() {
       return status;
   }
   
   public void setStatus(String status) {
       this.status = status;
   }
   
   @Override
   public void addBook() {
       System.out.println("Add a new textbook");
   }
   
   @Override
   public void updateBook(String id){
       if(getBookID().equals(id)){
           System.out.println("Update the textbook with ID: " + id);
       }
   }
   
   @Override
   public void displayBook() {
       System.out.println("Textbook Information: ");
       System.out.println("ID: " + getBookID());
       System.out.println("Publisher: " + getPublisher());
       System.out.println("Status: " + status);
   }
}
