package baitapthuchanh1502;
import java.util.Scanner;
public class btth1502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,tong=0;
        System.out.print("Nhap vao so nguyen duong n: ");
        n = sc.nextInt();  
        while (n>0) {
            tong+=n%10;
            n= n/10;
        }
        System.out.print("tong cac chu so cua n la: "+tong);
    sc.close();
    }
    }

