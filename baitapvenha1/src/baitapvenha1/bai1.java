
package baitapvenha;
import java.util.Scanner;
public class bai1 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap n ");
        int n = scanner.nextInt(); 
        if(n%2==0){
             System.out.println(" So chan ");
         }else {
             System.out.println(" So le ");
         }
     }
}