package toarray;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        int a = n;
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Output : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        boolean isPalindromic = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindromic = false;
            }
        }
        if (isPalindromic) {
            System.out.println("Dung ");
        } else {
            System.out.println("Sai ");
        }
    }
}
