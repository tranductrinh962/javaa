package app72;

public class SinhVien {
    private String ten;
    private String tuoi;
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()) {
            this.ten = "Không biết";
         } else {
            this.ten = ten;
            }
    }
    public String getTuoi() {
        if (Integer.valueOf(tuoi) != -1) {
           // Tuổi hợp lệ
            return tuoi;
         } else {
            return "Tuổi không hợp lệ";
            }
    }
    public void setTuoi(int tuoi) {
        // Kiểm tra tuổi có hợp lý hay không, nếu hợp lý thì lưu vào, nếu không sẽ
        if (tuoi > 18) {
           this.tuoi = String.valueOf(tuoi);
         } else {
            this.tuoi = String.valueOf(-1); 
}
    }
}


