package Model;

public class CanHo {
    private int MaCanHo;
    private String SoCanHo;
    private String ToaNha;
    private int Tang;
    private float DienTich;

    public CanHo() {
    }

    // Constructor cho trường hợp chỉ có MaCanHo và SoCanHo
    public CanHo(int maCanHo, String soCanHo) {
        this.MaCanHo = maCanHo;
        this.SoCanHo = soCanHo;
        this.ToaNha = ""; // Khởi tạo ToaNha với giá trị mặc định
        this.Tang = 0;    // Khởi tạo Tang với giá trị mặc định
        this.DienTich = 0.0f; // Khởi tạo DienTich với giá trị mặc định
    }

    // Constructor đầy đủ
    public CanHo(int maCanHo, String soCanHo, String toaNha, int tang, float dienTich) {
        this.MaCanHo = maCanHo;
        this.SoCanHo = soCanHo;
        this.ToaNha = toaNha;
        this.Tang = tang;
        this.DienTich = dienTich;
    }

    public int getMaCanHo() {
        return MaCanHo;
    }

    public void setMaCanHo(int maCanHo) {
        this.MaCanHo = maCanHo;
    }

    public String getSoCanHo() {
        return SoCanHo;
    }

    public void setSoCanHo(String soCanHo) {
        this.SoCanHo = soCanHo;
    }

    public String getToaNha() {
        return ToaNha;
    }

    public void setToaNha(String toaNha) {
        this.ToaNha = toaNha;
    }

    public int getTang() {
        return Tang;
    }

    public void setTang(int tang) {
        this.Tang = tang;
    }

    public float getDienTich() {
        return DienTich;
    }

    public void setDienTich(float dienTich) {
        this.DienTich = dienTich;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
