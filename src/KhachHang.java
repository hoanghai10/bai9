public class KhachHang extends BienLai{
    private String HoTen;
    private int SoNha;
    private int Msd;

    public KhachHang(int SDC, int SDM, String hoTen, int soNha, int msd) {
        super(SDC, SDM);
        this.HoTen = hoTen;
        this.SoNha = soNha;
        this.Msd = msd;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getSoNha() {
        return SoNha;
    }

    public void setSoNha(int soNha) {
        SoNha = soNha;
    }

    public int getMsd() {
        return Msd;
    }

    public void setMsd(int msd) {
        Msd = msd;
    }

    @Override
    public String toString(){
        return "KhachHang: " +
                "HoTen: " + HoTen + "\n" +
                "So nha: " + SoNha + "\n" +
                "Ma So Dien: " + Msd + "\n" +
                "SDM: " + SDM + "\n" +
                "SDC: " + SDC ;

    }

}
