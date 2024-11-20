package Controller;

import Model.CanHo;
import Model.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CanHoController extends Connect {
    
    public List<CanHo> getAllCanHo() {
        List<CanHo> canhoList = new ArrayList<>();
        String query = "SELECT * FROM CanHo";
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(query); 
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                CanHo canho = new CanHo();
                canho.setMaCanHo(rs.getInt("MaCanHo"));
                canho.setSoCanHo(rs.getString("SoCanHo"));
                canho.setToaNha(rs.getString("ToaNha"));
                canho.setTang(rs.getInt("Tang"));
                canho.setDienTich(rs.getFloat("DienTich"));
                canhoList.add(canho);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Có thể thay bằng logger
        }
        return canhoList;
    }

    // Thêm căn hộ
    public void addCanHo(CanHo canho) {
        String query = "INSERT INTO CanHo (SoCanHo, ToaNha, Tang, DienTich) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setString(1, canho.getSoCanHo());
            pstmt.setString(2, canho.getToaNha());
            pstmt.setInt(3, canho.getTang());
            pstmt.setFloat(4, canho.getDienTich());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Có thể thay bằng logger
        }
    }

    // Sửa căn hộ
    public void updateCanHo(CanHo canho) {
        String query = "UPDATE CanHo SET SoCanHo=?, ToaNha=?, Tang=?, DienTich=? WHERE MaCanHo=?";
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setString(1, canho.getSoCanHo());
            pstmt.setString(2, canho.getToaNha());
            pstmt.setInt(3, canho.getTang());
            pstmt.setFloat(4, canho.getDienTich());
            pstmt.setInt(5, canho.getMaCanHo());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cập nhật thành công.");
            } else {
                System.out.println("Không tìm thấy căn hộ có ID: " + canho.getMaCanHo());
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Có thể thay bằng logger
        }
    }

    public boolean checkCudanExistByMaCanHo(int maCanHo) {
        // Kết nối đến cơ sở dữ liệu và kiểm tra xem có cư dân nào tham chiếu đến căn hộ này không
        String sql = "SELECT COUNT(*) FROM CuDan WHERE MaCanHo = ?";
        try (Connection conn = connect(); // Thay Database.getConnection() bằng phương thức lấy kết nối của bạn
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, maCanHo);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Nếu có cư dân tham chiếu, trả về true
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Nếu không có cư dân tham chiếu, trả về false
    }

    // Phương thức xóa căn hộ
    public void deleteCanHo(int id) {
        String sql = "DELETE FROM CanHo WHERE MaCanHo = ?";
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi khi xóa căn hộ: " + e.getMessage());
        }
    }

    // Tìm kiếm căn hộ
    public List<CanHo> searchCanHo(String keyword) {
        List<CanHo> result = new ArrayList<>();
        String sql = "SELECT * FROM CanHo WHERE CAST(MaCanHo AS CHAR) LIKE ? OR CAST(SoCanHo AS CHAR) LIKE ? OR ToaNha LIKE ? OR CAST(Tang AS CHAR) LIKE ?";
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);
            pstmt.setString(4, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                CanHo canho = new CanHo();
                canho.setMaCanHo(rs.getInt("MaCanHo"));
                canho.setSoCanHo(rs.getString("SoCanHo"));
                canho.setToaNha(rs.getString("ToaNha"));
                canho.setTang(rs.getInt("Tang"));
                canho.setDienTich(rs.getFloat("DienTich"));
                result.add(canho);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Có thể thay bằng logger
        }
        return result;
    }
    
    // Lấy thông tin căn hộ theo ID
    public CanHo getCanHoById(int id) {
        String sql = "SELECT * FROM CanHo WHERE MaCanHo = ?";
        CanHo ch = null; // Khởi tạo biến căn hộ
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                ch = new CanHo();
                ch.setMaCanHo(rs.getInt("MaCanHo"));
                ch.setSoCanHo(rs.getString("SoCanHo"));
                ch.setToaNha(rs.getString("ToaNha"));
                ch.setTang(rs.getInt("Tang"));
                ch.setDienTich(rs.getFloat("DienTich"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Có thể thay bằng logger
        }
        return ch; // Trả về căn hộ hoặc null nếu không tìm thấy
    }
}
