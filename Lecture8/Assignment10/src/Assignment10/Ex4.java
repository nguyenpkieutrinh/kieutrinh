
package Assignment10;

public class Ex4 {
    void m(){
        System.out.println("method is invoked");
    }
    void n(){
        this.m();
    }
    void p(){
        n();
    }
    public static void main(String[] args) {
        Ex4 s1 = new Ex4();
        s1.p();
    }
}
