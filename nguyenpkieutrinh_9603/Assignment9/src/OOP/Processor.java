package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter details for myCar : " + i);
            System.out.print(" Model : ");

            String s = scanner.nextLine();
            System.out.print(" Year : ");
            int year = scanner.nextInt();
            scanner.nextLine();
            cars.add(new Car(s, year));
        }
        System.out.println(" : ");
        for (Car car : cars) {
            car.displayDetails();
        }
    }

}
