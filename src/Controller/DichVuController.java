
package Controller;

import Model.Connect;
import Model.DichVu;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DichVuController extends Connect {

    public List<DichVu> getallDichVu() throws SQLException {
        List<DichVu> listdv = new ArrayList<>();
        String sql = "SELECT * from DichVu ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                DichVu dichvu = new DichVu();

                dichvu.setMaDichVu(rs.getInt("MaDichVu"));
                dichvu.setTenDichVu(rs.getString("TenDichVu"));
                dichvu.setGia(rs.getFloat("Gia"));
                listdv.add(dichvu);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listdv;
    }

    // Phuong thuc them dich vu
    public void addDichVu(DichVu dichvu) {
        String query = "INSERT INTO DichVu(TenDichVu,Gia) VALUES(?,?) ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, dichvu.getTenDichVu());
            pstmt.setFloat(2, dichvu.getGia());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Phuong thuc sua dich vu
    public void updateDichVu(DichVu dichvu){
    String query = "UPDATE DichVu SET TenDichVu=? , Gia= ? WHERE MaDichVu=? ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, dichvu.getTenDichVu());
            pstmt.setFloat(2, dichvu.getGia());
            pstmt.setInt(3, dichvu.getMaDichVu()); 

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cập nhật thành công.");
            } else {
                System.out.println("Không tìm thấy dich vu có ID: " + dichvu.getMaDichVu());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Phuong thuc xoa dich vu
    public void deleteDichVu(int id) {
        String query = "DELETE from DichVu WHERE MaDichVu=?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi khi xóa nhân viên: " + e.getMessage());
        }
    }
    
    // Phuong thuc tim kiem dich vu
    public List<DichVu> searchDichVu(String keyword){
    List<DichVu> dichvulist = new ArrayList<>();
    String sql = "SELECT * FROM DichVu WHERE CAST(MaDichVu AS CHAR) LIKE ? OR CAST(TenDichVu AS CHAR) LIKE ? OR CAST(Gia AS CHAR) LIKE ? ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            
            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                DichVu dichvu = new DichVu();
                dichvu.setMaDichVu(rs.getInt("MaDichVu"));
                dichvu.setTenDichVu(rs.getString("TenDichVu"));
                dichvu.setGia(rs.getFloat("Gia"));
                dichvulist.add(dichvu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     return dichvulist;
    }
    
    
    // Lấy thông tin dich vu theo ID
    public DichVu getDichVuById(int id) {
        String sql = "SELECT * FROM DichVu WHERE MaDichVu = ?";
        DichVu dv = null; // 
        try (java.sql.Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                dv = new DichVu();
                 dv.setMaDichVu(rs.getInt("MaDichVu")); 
                dv.setTenDichVu(rs.getString("TenDichVu"));
                dv.setGia(rs.getFloat("Gia"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return dv;
    }
    
}
