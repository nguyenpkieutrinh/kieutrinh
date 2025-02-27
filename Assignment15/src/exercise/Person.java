package exercise;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public abstract class Person implements IPerson {

    String ID;
    String fullName;
    Date dateOfBirth;
    Date bookBorrowDate;
    Date bookReturnDate;
    
    public Person(String ID, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.ID = ID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }
    
    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }
    
    public Date getBookReturnDate() {
        return bookReturnDate;
    }
    
    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }
    
    @Override
    public void addPerson() {
        try {
            
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter Person ID : ");
            setID(scanner.nextLine());
            System.out.println("Full name : ");
            setFullName(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Date of birth : ");
            String dateOfBirth = scanner.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.println("Book Borrow Date : ");
            String bookBorrowDate = scanner.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.println("Book Return Date  : ");
            String bookReturnDate = scanner.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
        } catch (ParseException e) {
            System.out.println(e);
        }
        
    }
    
    @Override
    public void updatePerson(String ID) {
        if (this.ID.equals(ID)) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(" Enter Person ID : ");
                setID(scanner.nextLine());
                System.out.println("Full name : ");
                setFullName(scanner.nextLine());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Date of birth : ");
                String dateOfBirth = scanner.nextLine();
                setDateOfBirth(sdf.parse(dateOfBirth));
                System.out.println("Book Borrow Date : ");
                String bookBorrowDate = scanner.nextLine();
                setBookBorrowDate(sdf.parse(bookBorrowDate));
                System.out.println("Book Return Date  : ");
                String bookReturnDate = scanner.nextLine();
                setBookReturnDate(sdf.parse(bookReturnDate));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID " + getID() + ", Full Name " + getFullName() + ", Date Of Birth " + sdf.format(dateOfBirth) + ", Book borrow date " + sdf.format(bookBorrowDate) + ", Book retrun date " + sdf.format(bookReturnDate));
        
    }
    
}
