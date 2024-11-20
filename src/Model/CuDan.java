
package Model;

public class CuDan extends Enity {
    private int MaCuDan;
    private String HoTen;
    private String Sdt;
    private String Email;
    private int MaCanHo;

    public CuDan() {
    }

    public CuDan(int MaCuDan, String HoTen, String Sdt, String Email, int MaCanHo) {
        this.MaCuDan = MaCuDan;
        this.HoTen = HoTen;
        this.Sdt = Sdt;
        this.Email = Email;
        this.MaCanHo = MaCanHo;
    }

    public CuDan(int MaCuDan, String HoTen, String Sdt, String Email, int MaCanHo, int id) {
        super(id);
        this.MaCuDan = MaCuDan;
        this.HoTen = HoTen;
        this.Sdt = Sdt;
        this.Email = Email;
        this.MaCanHo = MaCanHo;
    }

    public int getMaCuDan() {
        return MaCuDan;
    }

    public void setMaCuDan(int MaCuDan) {
        this.MaCuDan = MaCuDan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getMaCanHo() {
        return MaCanHo;
    }

    public void setMaCanHo(int MaCanHo) {
        this.MaCanHo = MaCanHo;
    }
    
}
