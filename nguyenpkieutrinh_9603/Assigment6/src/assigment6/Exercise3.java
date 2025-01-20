package assigment6;

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(11.02);
        prices.add(13.80);
        prices.add(22.75);
        prices.add(44.90);
        prices.add(34.15);
        System.out.println("Output : ");
        for (double price : prices) {
            System.out.println(price);
        }
    }
}
