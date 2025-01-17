package toarray;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        int max = n;
        int min = n;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Output : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(" Max : " + max);
        System.out.println(" Min : " + min);
    }
}
