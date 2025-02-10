package strings;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine().trim();
        String[] words = s.split(" ");
        System.out.println("So tu trong chuoi: " + words.length);
        scanner.close();
    }
}
