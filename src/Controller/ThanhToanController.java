
package Controller;

import Model.Connect;
import Model.CuDan;
import Model.DichVu;
import Model.ThanhToan;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ThanhToanController extends Connect {
    public List<ThanhToan> getallThanhToan() {
    List<ThanhToan> thanhtoanList = new ArrayList<>();
        String query = "SELECT * FROM [ThanhToan]";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ThanhToan thanhtoan = new ThanhToan();
                thanhtoan.setMaThanhToan(rs.getInt("MaThanhToan"));
                thanhtoan.setMaCuDan(rs.getInt("MaCuDan"));
                thanhtoan.setMaDichVu(rs.getInt("MaDichVu"));
                thanhtoan.setSoTien(rs.getFloat("SoTien"));
                thanhtoan.setNgayThanhToan(rs.getDate("NgayThanhToan"));

                thanhtoanList.add(thanhtoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thanhtoanList;
    }
    
    // Phương thức thêm thanh toan
    public void addThanhToan(ThanhToan thanhtoan) {
        String query = "INSERT INTO [ThanhToan] (MaCuDan, MaDichVu, SoTien,NgayThanhToan) VALUES (?, ?, ?, ?)";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, thanhtoan.getMaCuDan());
            pstmt.setInt(2, thanhtoan.getMaDichVu());
            pstmt.setFloat(3, thanhtoan.getSoTien());
            pstmt.setDate(4, new java.sql.Date(thanhtoan.getNgayThanhToan().getTime()));

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateThanhToan(ThanhToan thanhtoan) {

        String query = "UPDATE [ThanhToan] SET MaCuDan=?, MaDichVu=?, SoTien=?, NgayThanhToan=? WHERE MaThanhToan=?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, thanhtoan.getMaCuDan());
            pstmt.setInt(2, thanhtoan.getMaDichVu());
            pstmt.setFloat(3, thanhtoan.getSoTien());
            pstmt.setDate(4, new java.sql.Date(thanhtoan.getNgayThanhToan().getTime()));
            pstmt.setInt(5, thanhtoan.getMaThanhToan());

            // Thực thi lệnh cập nhật
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cập nhật thanh toán thất bại: " + e.getMessage());
        }
    }
    
     //Phuong thuc xoa Thanh Toan
    public void deleteThanhToan(int id) {
        String query = "DELETE FROM [ThanhToan] WHERE [MaThanhToan] = ?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     // Phuong thuc tim kiêm thanh Toán
    public List<ThanhToan> searchThanhTOan(String keyword) {
        List<ThanhToan> thanhtoanlist = new ArrayList<>();
        String sql = "SELECT * FROM [ThanhToan] WHERE CAST(MaThanhToan AS CHAR) LIKE ? OR CAST(MaCuDan AS CHAR) LIKE ? OR CAST(MaDichVu AS CHAR) LIKE ? OR CAST(SoTien AS CHAR) LIKE ? OR CAST(NgayThanhToan AS CHAR) LIKE ?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);
            pstmt.setString(4, searchValue);
            pstmt.setString(5, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ThanhToan thanhtoan = new ThanhToan();
                thanhtoan.setMaThanhToan(rs.getInt("MaThanhToan"));
                thanhtoan.setMaCuDan(rs.getInt("MaCuDan"));
                thanhtoan.setMaDichVu(rs.getInt("MaDichVu"));
                thanhtoan.setSoTien(rs.getFloat("Sotien"));
                thanhtoan.setNgayThanhToan(rs.getDate("NgayThanhToan"));

                thanhtoanlist.add(thanhtoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thanhtoanlist;
    }

    // Phương thức lấy GetDichVu
    public List<DichVu> getDichVu() {
        List<DichVu> dichvus = new ArrayList<>();
        String sql = "SELECT * FROM DichVu";

        try (java.sql.Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                DichVu dichvu = new DichVu();
                dichvu.setMaDichVu(rs.getInt("MaDichVu"));
                dichvu.setTenDichVu(rs.getString("TenDichVu")); 
                dichvu.setGia(rs.getFloat("Gia"));
                dichvus.add(dichvu);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dichvus;
    }
    
    // Phương thức lấy getCuDan
    public List<CuDan> getCuDan() {
        List<CuDan> cudans = new ArrayList<>();
        String sql = "SELECT * FROM CuDan";

        try (java.sql.Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                CuDan cudan = new CuDan();  
                cudan.setMaCuDan(rs.getInt("MaCuDan"));
                cudan.setHoTen(rs.getString("HoTen"));
                cudan.setSdt(rs.getString("Sdt"));
                cudan.setEmail(rs.getString("Email"));
                cudan.setMaCanHo(rs.getInt("MaCanHo"));

                cudans.add(cudan);  // Thêm vào danh sách
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cudans;  
    }
    
  

}
