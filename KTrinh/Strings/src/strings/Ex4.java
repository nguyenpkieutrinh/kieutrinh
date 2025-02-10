package strings;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String s = scanner.nextLine().trim();
        System.out.print(" Chuoi sau khi loai bo la : " + s);
        scanner.close();
    }
}
