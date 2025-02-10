package strings;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Chuoi dao nguoc la: " + reversed);
        scanner.close();
    }
}
