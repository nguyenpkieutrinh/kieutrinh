package assigment6;

import java.util.ArrayList;

public class Exercise4 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add(" NewYork ");
        cities.add(" LonDon ");
        cities.add(" Hoa Ki ");
        cities.add(" Paris ");
        cities.add(" Tokyo ");
        if (cities.contains(" LonDon ")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
