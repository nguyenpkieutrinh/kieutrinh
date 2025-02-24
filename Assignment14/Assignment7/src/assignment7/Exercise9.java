package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print(" Output : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" Numbers " + (i + 1) + " : ");
            numbers.add(scanner.nextInt());
        }
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(" Numbers : " + numbers);
        System.out.println(" Max : " + max);
        System.out.println(" Min : " + min);
    }
}
