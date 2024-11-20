
package Model;

import java.util.Date;

public class ThanhToan {
    private int MaThanhToan;
    private int MaCuDan;
    private int MaDichVu;
    private float SoTien;
    private Date NgayThanhToan;

    public ThanhToan() {
    }

    public ThanhToan(int MaThanhToan, int MaCuDan, int MaDichVu, float SoTien, Date NgayThanhToan) {
        this.MaThanhToan = MaThanhToan;
        this.MaCuDan = MaCuDan;
        this.MaDichVu = MaDichVu;
        this.SoTien = SoTien;
        this.NgayThanhToan = NgayThanhToan;
    }

    public int getMaThanhToan() {
        return MaThanhToan;
    }

    public void setMaThanhToan(int MaThanhToan) {
        this.MaThanhToan = MaThanhToan;
    }

    public int getMaCuDan() {
        return MaCuDan;
    }

    public void setMaCuDan(int MaCuDan) {
        this.MaCuDan = MaCuDan;
    }

    public int getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(int MaDichVu) {
        this.MaDichVu = MaDichVu;
    }

    public float getSoTien() {
        return SoTien;
    }

    public void setSoTien(float SoTien) {
        this.SoTien = SoTien;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }
    
}
