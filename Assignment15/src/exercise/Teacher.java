
package exercise;

import java.util.Date;
import java.util.Scanner;


public class Teacher extends Person {
    String department ;
    String teachingSubject ;

    public Teacher(String department, String teachingSubject, String ID, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(ID, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
}
    @Override
    public void displayInfo(){
      super.displayInfo();
        System.out.println("Department " + getDepartment() + ", Teaching subject  " + getTeachingSubject());
        
}
    @Override
    public  void updatePerson(String ID){
       if (getID().equals(ID)) {
            Scanner scanner = new Scanner(System.in);
            super.updatePerson(ID);
            System.out.println("Department : ");
            setDepartment(scanner.nextLine());
            System.out.println("Teaching Subject  : ");
            setTeachingSubject(scanner.nextLine());
            System.out.println("Successfull");
        } else {
            System.out.println("Not found ID " + ID);
        }
    }

    @Override
    public  void addPerson(){
        Scanner scanner = new Scanner(System.in);
        super.addPerson();
        System.out.println("Enter department : ");
        setDepartment(scanner.nextLine());
        System.out.println("Teaching subject : ");
        setTeachingSubject(scanner.nextLine());
}
}

