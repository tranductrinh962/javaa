import java.util.LinkedList;
import java.util.Scanner;
public class app41{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Tháng 1");
        linkedList.add("Tháng 2");
        linkedList.add("Tháng 3");
        linkedList.add("Tháng 4");
        linkedList.add("Tháng 5");
        linkedList.add("Tháng 6");
        linkedList.add("Tháng 7");
        linkedList.add("Tháng 8");
        linkedList.add("Tháng 9");
        linkedList.add("Tháng 10");
        linkedList.add("Tháng 11");
        linkedList.add("Tháng 12");
        System.out.println("Nhập vào chi số của phần tử cần lấy: ");
        int index=scanner.nextInt();
        scanner.close();
    if ((index<0)||(index>(linkedList.size() -1))){
System.out.println("Chi số càn lấy phải lớn hơn 0 và nhỏ hơn" + (linkedList.size()-1));
}else{
String node=linkedList.get(index);
System.out.println("Phần từ có chỉ số="+index+ "trong linkedlist là "+ node);
}
String firstNode= linkedList.getFirst();

String lastNode=linkedList.getLast();
System.out.println("\nPhần tử đầu tiên trong danh sách là "+ firstNode+ "; Phần tử cuối cùng trong danh sách là"+lastNode);
}
}