package assignment7;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + " : ");
            names.add(scanner.nextLine());
        }
        System.out.println("Original list: " + names);
        ArrayList<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }

        System.out.println("List after removing duplicates: " + uniqueNames);
    }

}
