
package Model;

public class DichVu {
    private int MaDichVu;
    private String TenDichVu;
    private float Gia;

    public DichVu() {
    }

    public DichVu(int MaDichVu, String TenDichVu, float Gia) {
        this.MaDichVu = MaDichVu;
        this.TenDichVu = TenDichVu;
        this.Gia = Gia;
    }

    public int getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(int MaDichVu) {
        this.MaDichVu = MaDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
}
