package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Numbers " + (i + 1) + " : ");
            numbers.add(scanner.nextInt());
        }
        System.out.println("Original list: " + numbers);
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(size - 1 - i));
            numbers.set(size - 1 - i, temp);
        }
        System.out.println("Reversed list: " + numbers);
    }
}
