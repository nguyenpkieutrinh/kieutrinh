package Exercses;

import java.util.*;

public class Student {

    String ID, Name, Major;
    float GPA;

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        ID = scanner.nextLine();
        System.out.print("Name: ");
        Name = scanner.nextLine();
        System.out.print("Date of Birth : ");
        int date = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Major: ");
        Major = scanner.nextLine();
        System.out.print("GPA: ");
        GPA = scanner.nextFloat();
        
    }

    public void hienThiThongTin() {
        System.out.println(ID + ": " + Name + ", " + Major + ", GPA: " + GPA);
    }
}
