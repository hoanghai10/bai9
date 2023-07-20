import java.util.ArrayList;
import java.util.List;

public class ThucHien extends BienLai{
    private List<KhachHang> khachhangs;

    public ThucHien(){
        super();
        this.khachhangs = new ArrayList<>();
    }

    public void addKhachhang(KhachHang khachhang){
        this.khachhangs.add(khachhang);
    }


    public boolean delete(String HoTen) {
        KhachHang khachHang = this.khachhangs.stream()
                .filter(t -> t.getHoTen().equals(HoTen))
                .findFirst().orElse(null);
        if (khachHang == null) {
            return false;
        }
        this.khachhangs.remove(khachHang);
        return true;

    }
    public void showKh() {
        this.khachhangs.forEach(khachHang -> System.out.println(khachhangs.toString()));
    }
    public int sum(String HoTen){
        KhachHang khachHang = this.khachhangs.stream()
                .filter(t -> t.getHoTen().equals(HoTen))
                .findFirst().orElse(null);
        return (SDM - SDC) * 5;
    }

}
