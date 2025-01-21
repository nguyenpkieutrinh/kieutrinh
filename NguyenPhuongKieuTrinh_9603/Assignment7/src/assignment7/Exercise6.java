package assignment7;

import java.util.ArrayList;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(50) + 1);
        }

        int oddCount = 0, evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
