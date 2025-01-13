
package baitapvenha;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so ");
        int a = scanner.nextInt();
        if(a==1){
            System.out.println(" Chu nhat ");
        }else if( a==2 ){
            System.out.println(" Thu hai ");
        }else if(a==3){
            System.out.println(" Thu ba ");
        }else if( a==4){
            System.out.println(" Thu tu ");
        }else if(a==5){
            System.out.println(" Thu nam ");
        }else if(a==6){
            System.out.println(" Thu sau ");
        }else if(a==7){
            System.out.println(" Thu bay ");
        }else{
            System.out.println(" Khong hop le ");
        }
    }
}
