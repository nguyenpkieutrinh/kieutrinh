package Assignment10;

public class Ex3 {

    int id;
    String name;

    Ex3() {
        System.out.println("default constructor is invoked ");
    }

    Ex3(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Ex3 s1 = new Ex3(111, "Karan");
        Ex3 s2 = new Ex3(333, "Aray");
        s1.display();
        s2.display();
    }
}
