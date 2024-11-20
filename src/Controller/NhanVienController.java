
package Controller;

import Model.Connect;
import Model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienController extends Connect {

    public List<NhanVien> getallNhanVien() throws SQLException {
        List<NhanVien> listNV = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                NhanVien nv = new NhanVien();

                nv.setMaNhanVien(rs.getInt("MaNhanVIen"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setVaiTro(rs.getString("VaiTro"));
                nv.setSdt(rs.getString("SoDienThoai"));
                listNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

    // Phuong thuc them nhan vien
    public void addNhanVien(NhanVien nhanvien) {
        String query = "INSERT INTO NhanVien(HoTen, VaiTro, SoDienThoai) VALUES(?,?,?) ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
        System.out.println("HoTen: " + nhanvien.getHoTen());
            pstmt.setString(1, nhanvien.getHoTen());
            pstmt.setString(2, nhanvien.getVaiTro());
            pstmt.setString(3, nhanvien.getSdt());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Phương thức sửa nhân viên
    public void updateNhanVien(NhanVien nhanvien) {
        String query = "UPDATE NhanVien SET HoTen=? , VaiTro= ? , SoDienThoai=? WHERE MaNhanVien=? ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nhanvien.getHoTen());
            pstmt.setString(2, nhanvien.getVaiTro());
            pstmt.setString(3, nhanvien.getSdt());
            pstmt.setInt(4, nhanvien.getMaNhanVien());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cập nhật thành công.");
            } else {
                System.out.println("Không tìm thấy nhan vien có ID: " + nhanvien.getMaNhanVien());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Phuong thuc xoa nhân viên
    public void deleteNhanVien(int id) {
        String query = "DELETE from NhanVien WHERE MaNhanVien=?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi khi xóa nhan vien: " + e.getMessage());
        }
    }

    // Phuong thuc tim kiem dich vu
    public List<NhanVien> searchNhanVien(String keyword) {
        List<NhanVien> nhanvienlist = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE CAST(MaNhanVien AS CHAR) LIKE ? OR CAST(HoTen AS CHAR) LIKE ? OR CAST(VaiTro AS CHAR) LIKE ? OR CAST(SoDienThoai AS CHAR) LIKE ? ";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);
            pstmt.setString(4, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                NhanVien nhanvien = new NhanVien();
                nhanvien.setMaNhanVien(rs.getInt("MaNhanVien"));
                nhanvien.setHoTen(rs.getString("HoTen"));
                nhanvien.setVaiTro(rs.getString("VaiTro"));
                nhanvien.setSdt(rs.getString("SoDienThoai"));
                nhanvienlist.add(nhanvien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nhanvienlist;
    }
}
