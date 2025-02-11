package Assignment10;

public class Ex1 {

    int id;
    String name;

    Ex1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Ex1 s1 = new Ex1(111, "Karan");
        Ex1 s2 = new Ex1(321, "Aray");
        s1.display();
        s2.display();
    }

}
