package app79;
public class Nhanvienfulltime extends NhanVien{
    private int gioLamViec;
  
  public Nhanvienfulltime(String ten, int gioLamViec){
      this.ten=ten;
      this.gioLamViec=gioLamViec;
     
  }
  @Override
  public String loaiNhanVien(){
      return "Nhan vien chinh thuc";
  }
  public void tinhLuong(){
      luong= configs.LUONG_FULL_TIME * gioLamViec;
  }
public void setloaiNhanVien(int sep) {
}
   
}