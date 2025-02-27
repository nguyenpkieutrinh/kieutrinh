package exercise;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    float GPA;
    String major;

    public Student(float GPA, String major, String ID, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(ID, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPA " + getGPA() + ", Major " + getMajor());
    }

    @Override
    public void updatePerson(String ID) {
        if (getID().equals(ID)) {
            Scanner scanner = new Scanner(System.in);
            super.updatePerson(ID);
            System.out.println("GPA : ");
            setGPA(scanner.nextFloat());
            System.out.println("Major : ");
            setMajor(scanner.nextLine());
            System.out.println("Successfull");
        } else {
            System.out.println("Not found ID " + ID);
        }
    }

    @Override
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        super.addPerson();
        System.out.println("GPA : ");
        setGPA(scanner.nextFloat());
        System.out.println("Major : ");
        setMajor(scanner.nextLine());
        System.out.println("Successfull");
    }

}
