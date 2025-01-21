package assignment7;

import java.util.ArrayList;
import java.util.Scanner;
public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Fruit "+ (i+1)+" : ");
            fruits.add(scanner.nextLine());
        }
        ArrayList<String> copiedFruits = new ArrayList<>(fruits);

        System.out.println("Original list: " + fruits);
        System.out.println("Copied list: " + copiedFruits);
    }
}
