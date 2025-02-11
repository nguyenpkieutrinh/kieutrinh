package Assignment10;

public class Ex2 {

    int id;
    String name;

    Ex2(int i , String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Ex1 e1 = new Ex1(111, "Karan");
        Ex1 e2 = new Ex1(222, "Aray");
        e1.display();
        e2.display();
    }
}
