package assignment7;

import java.util.Random;
import java.util.ArrayList;

public class Exercise11 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }
        System.out.println(" Numbers : "+ numbers );
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
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
