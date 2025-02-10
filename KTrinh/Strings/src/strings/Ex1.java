package strings;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap chuoi : ");
        String s = scanner.nextLine();
        System.out.print(" So ki tu trong chuoi la : " + s.length());
        scanner.close();
    }

}
