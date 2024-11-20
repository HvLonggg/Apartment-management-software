
package Model;


public class NhanVien {
    private int MaNhanVien;
    private String HoTen;
    private String VaiTro;
    private String SoDienThoai;

    public NhanVien() {
    }

    public NhanVien(int MaNhanVien, String HoTen, String VaiTro, String Sdt) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.VaiTro = VaiTro;
        this.SoDienThoai = Sdt;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getSdt() {
        return SoDienThoai;
    }

    public void setSdt(String Sdt) {
        this.SoDienThoai = Sdt;
    }
    
}
