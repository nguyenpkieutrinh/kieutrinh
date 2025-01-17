package toarray;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Output : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
        System.out.print("Input ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
