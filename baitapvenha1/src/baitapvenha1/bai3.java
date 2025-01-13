

package baitapvenha;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap nam ");
        int n = scanner.nextInt();
        if(n%4==0&&n%100!=0||n%400==0){
            System.out.println(n+ " La nam nhuan ");
        }else{
            System.out.println(n+ " Khong phai la nam nhuan ");
        }
    }
}
