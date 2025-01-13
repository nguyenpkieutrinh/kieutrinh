
package baitapvenha;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap a ");
        int a = scanner.nextInt();
        System.out.print(" Nhap b ");
        int b = scanner.nextInt();
        System.out.print(" Nhap c ");
        int c = scanner.nextInt();
        if(a>b&&a>c){
            System.out.println(a + " la so lon nhat ");
        }else if( b>a&&b>c){
            System.out.println(b + " la so lon nhat ");
        }else if( c>a&&c>b){
            System.out.println(c + " la so lon nhat ");
        }else{
            System.out.println(" Cac so deu bang nhau ");
        }
    }
}
