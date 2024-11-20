package Model;

import java.util.Date;

public class HopDong {

    private int MaHopDong;
    private int MaCuDan;
    private int MaCanHo;
    private Date NgayBatDau;
    private Date NgayKetThuc;

    public HopDong() {
    }

    public HopDong(int MaHopDong, int MaCuDan, int MaCanHo, Date NgayBatDau, Date NgayKetThuc) {
        this.MaHopDong = MaHopDong;  // Thêm vào MaHopDong
        this.MaCuDan = MaCuDan;
        this.MaCanHo = MaCanHo;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    public int getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(int MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public int getMaCuDan() {
        return MaCuDan;
    }

    public void setMaCuDan(int MaCuDan) {
        this.MaCuDan = MaCuDan;
    }

    public int getMaCanHo() {
        return MaCanHo;
    }

    public void setMaCanHo(int MaCanHo) {
        this.MaCanHo = MaCanHo;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

}
