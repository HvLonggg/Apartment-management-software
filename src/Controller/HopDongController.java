package Controller;

import Model.CanHo;
import Model.HopDong;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.Connect;
import Model.CuDan;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class HopDongController extends Connect {

    public List<HopDong> getAllHopDong() {
        List<HopDong> hopdongList = new ArrayList<>();
        String query = "SELECT * FROM [HopDong]";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HopDong hopdong = new HopDong();
                hopdong.setMaHopDong(rs.getInt("MaHopDong"));
                hopdong.setMaCuDan(rs.getInt("MaCuDan"));
                hopdong.setMaCanHo(rs.getInt("MaCanHo"));
                hopdong.setNgayBatDau(rs.getDate("NgayBatDau"));
                hopdong.setNgayKetThuc(rs.getDate("NgayKetThuc"));

                hopdongList.add(hopdong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hopdongList;
    }

    // Phương thức thêm hop dong
    public void addHopDong(HopDong hopdong) {
        String query = "INSERT INTO [HopDong] (MaCuDan, MaCanHo, NgayBatDau,NgayKetThuc) VALUES (?, ?, ?, ?)";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, hopdong.getMaCuDan());
            pstmt.setInt(2, hopdong.getMaCanHo());
            pstmt.setDate(3, new java.sql.Date(hopdong.getNgayBatDau().getTime()));
            pstmt.setDate(4, new java.sql.Date(hopdong.getNgayKetThuc().getTime()));

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateHopDong(HopDong hopdong) {

        String query = "UPDATE [HopDong] SET MaCuDan=?, MaCanHo=?, NgayBatDau=?, NgayKetThuc=? WHERE MaHopDong=?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, hopdong.getMaCuDan());
            pstmt.setInt(2, hopdong.getMaCanHo());
            pstmt.setDate(3, new java.sql.Date(hopdong.getNgayBatDau().getTime()));
            pstmt.setDate(4, new java.sql.Date(hopdong.getNgayKetThuc().getTime()));
            pstmt.setInt(5, hopdong.getMaHopDong());

            // Thực thi lệnh cập nhật
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cập nhật hợp đồng thất bại: " + e.getMessage());
        }
    }

    //Phuong thuc xoa Hop dong
    public void deleteHopDong(int id) {
        String query = "DELETE FROM [HopDong] WHERE [MaHopDong] = ?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Phuong thuc tim kiêm HopDong
    public List<HopDong> searchHopDong(String keyword) {
        List<HopDong> hopdonglist = new ArrayList<>();
        String sql = "SELECT * FROM [HopDong] WHERE CAST(MaHopDong AS CHAR) LIKE ? OR CAST(MaCuDan AS CHAR) LIKE ? OR CAST(MaCanHo AS CHAR) LIKE ? OR CAST(NgayBatDau AS CHAR) LIKE ? OR CAST(NgayKetThuc AS CHAR) LIKE ?";
        try (java.sql.Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);
            pstmt.setString(4, searchValue);
            pstmt.setString(5, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HopDong hopdong = new HopDong();
                hopdong.setMaHopDong(rs.getInt("MaHopDong"));
                hopdong.setMaCuDan(rs.getInt("MaCuDan"));
                hopdong.setMaCanHo(rs.getInt("MaHopDong"));
                hopdong.setNgayBatDau(rs.getDate("NgayBatDau"));
                hopdong.setNgayKetThuc(rs.getDate("NgayKetThuc"));

                hopdonglist.add(hopdong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hopdonglist;
    }

    // Phương thức lấy GetCanHo
    public List<CanHo> getCanHo() {
        List<CanHo> canhos = new ArrayList<>();
        String sql = "SELECT * FROM CanHo";

        try (java.sql.Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int maCanHo = rs.getInt("MaCanHo");
                String soCanHo = rs.getString("SoCanHo");
                canhos.add(new CanHo(maCanHo, soCanHo));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return canhos;
    }

// Phương thức lấy CuDan
    public List<CuDan> getCuDan() {
        List<CuDan> cudans = new ArrayList<>();
        String sql = "SELECT * FROM CuDan";

        try (java.sql.Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                CuDan cudan = new CuDan();  // Sửa để tạo đối tượng CuDan
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
        return cudans;  // Trả về danh sách CuDan
    }

}
