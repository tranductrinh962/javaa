package baithuchanh0103;
import java.util.Scanner;
public class app90 {
    public static void main(String[] args) {
        String chuoi;      
        char kyTu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki: ");
        chuoi = sc.nextLine();
        System.out.println("Cac ky tu trong chuoi la: ");
          for (int i = 0; i < chuoi.length(); i++) {
              kyTu = chuoi.charAt(i);
              System.out.println(kyTu);
          }
            sc.close();
      }
}
