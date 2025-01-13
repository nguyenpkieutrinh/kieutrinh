

package baitapvenha;
import java.util.Scanner;
public class baiGPTBH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a ");
        double a = scanner.nextFloat();
        System.out.print("Nhap b ");
        double b = scanner.nextFloat();
        System.out.print("Nhap c ");
        double c = scanner.nextFloat();
        double delta = b*b-4*a*c;
        System.out.println("Delta : "+delta);
        if(delta>0){
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println(" Phuong trinh co 2 nghiem la ");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }else if(delta==0){
            double x=(-b)/(2*a);
            System.out.println(" Phuong trinh co 2 nghiem kep la "+x);
        }else{
            System.out.println(" Phuong trinh vo nghiem");
        }
    }
}
