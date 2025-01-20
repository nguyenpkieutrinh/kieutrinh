package assigment6;

import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add(" Black ");
        colors.add(" Blue ");
        colors.add(" Red ");
        colors.add(" Green ");
        colors.add(" White ");
        System.out.println("Input : " + colors);
        colors.set(1, "Yellow");
        System.out.println("Output : " + colors);

    }
}
