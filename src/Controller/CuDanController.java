
package Controller;

import Model.CanHo;
import Model.Connect;
import Model.CuDan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuDanController extends Connect {

    public List<CuDan> getAllCuDan() {
        List<CuDan> cudanList = new ArrayList<>();
        String query = "SELECT * FROM [CuDan]";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                CuDan cudan = new CuDan();
                cudan.setMaCuDan(rs.getInt("MaCuDan"));
                cudan.setHoTen(rs.getString("HoTen"));
                cudan.setSdt(rs.getString("SoDienThoai"));
                cudan.setEmail(rs.getString("Email"));
                cudan.setMaCanHo(rs.getInt("MaCanHo"));
                cudanList.add(cudan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cudanList;
    }
    
    // Phương thức để lấy tổng số cu dân
    public int getTotalCuDan() throws SQLException {
        try {
        String query = "SELECT COUNT(*) FROM [CuDan]";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CuDanController.class.getName()).log(Level.SEVERE, null, ex);
        }
     } catch (Exception e) {
         e.printStackTrace();
        }
        return 0;
    }
    
   // Phương thức thêm cư đân
    public void adđCuDan(CuDan cudan){
    String query = "INSERT INTO CuDan (HoTen, SoDienThoai, Email, MaCanHo) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, cudan.getHoTen());
            pstmt.setString(2, cudan.getSdt());
            pstmt.setString(3, cudan.getEmail());
            pstmt.setInt(4, cudan.getMaCanHo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void updateCuDan(CuDan cudan) {
    // Kiểm tra xem MaCanHo mới có tồn tại trong bảng CanHo không
    if (!isMaCanHoExist(cudan.getMaCanHo())) {
        System.out.println("MaCanHo không tồn tại trong bảng CanHo!");
        return;
    }

    String sql = "UPDATE CuDan SET HoTen = ?, SoDienThoai = ?, Email = ?, MaCanHo = ? WHERE MaCuDan = ?";
    
    try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, cudan.getHoTen());
        pstmt.setString(2, cudan.getSdt());
        pstmt.setString(3, cudan.getEmail());
        pstmt.setInt(4, cudan.getMaCanHo());
        pstmt.setInt(5, cudan.getMaCuDan());

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy cư dân với ID: " + cudan.getMaCuDan());
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

// Phương thức kiểm tra MaCanHo có tồn tại trong bảng CanHo
public boolean isMaCanHoExist(int MaCanHo) {
    String sql = "SELECT COUNT(*) FROM CanHo WHERE MaCanHo = ?";
    
    try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, MaCanHo);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

    
    
    
   // Phương thức xóa cư dân
public void deleteCuDan(int id) {
    String deleteHopDongSql = "DELETE FROM [HopDong] WHERE [MaCuDan] = ?";
    String deleteCuDanSql = "DELETE FROM [CuDan] WHERE [MaCuDan] = ?";
    
    try (Connection conn = connect()) {
        // Xóa các bản ghi liên quan trong bảng HopDong
        try (PreparedStatement pstmt1 = conn.prepareStatement(deleteHopDongSql)) {
            pstmt1.setInt(1, id);
            pstmt1.executeUpdate();
        }

        // Xóa cư dân trong bảng CuDan
        try (PreparedStatement pstmt2 = conn.prepareStatement(deleteCuDanSql)) {
            pstmt2.setInt(1, id);
            int rowsAffected = pstmt2.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Xóa thành công cư dân có ID: " + id);
            } else {
                System.out.println("Không tìm thấy cư dân có ID: " + id);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
  public boolean checkCudanExistByMaCuDan(int maCuDan) {
    String sql = "SELECT COUNT(*) FROM CuDan WHERE MaCuDan = ?";
    try (Connection conn = connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, maCuDan);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Nếu có cư dân tham chiếu, trả về true
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; // Nếu không có cư dân tham chiếu, trả về false
}


    // Phương thức tìm kiếm cư đân
    public List<CuDan> searchCuDan(String keyword) {
        List<CuDan> result = new ArrayList<>();
        String sql = "SELECT * FROM CuDan WHERE CAST(MaCuDan AS CHAR) LIKE ? OR CAST(HoTen AS CHAR) LIKE ? OR SoDienThoai LIKE ? OR CAST(Email AS CHAR) LIKE ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String searchValue = "%" + keyword + "%";
            pstmt.setString(1, searchValue);
            pstmt.setString(2, searchValue);
            pstmt.setString(3, searchValue);
            pstmt.setString(4, searchValue);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                CuDan canho = new CuDan();
                canho.setMaCuDan(rs.getInt("MaCuDan")); // Sửa lại lấy ID
                canho.setHoTen(rs.getString("HoTen"));
                canho.setSdt(rs.getString("SoDienThoai"));
                canho.setEmail(rs.getString("Email"));
                canho.setMaCanHo(rs.getInt("MaCanHo"));
                result.add(canho);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
// Phương thức lấy GetCanHo
public List<CanHo> getCanHo() {
    List<CanHo> canhos = new ArrayList<>();
    String sql = "SELECT * FROM CanHo";
    
    try (Connection conn = connect(); 
         Statement stmt = conn.createStatement(); 
         ResultSet rs = stmt.executeQuery(sql)) {
        
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

// Lấy thông tin căn hộ theo ID
    public CuDan getCuDanById(int id) {
        String sql = "SELECT * FROM CuDan WHERE MaCuDan = ?";
        CuDan cd = null; // Khởi tạo biến căn hộ
        try (Connection conn = connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                cd = new CuDan();
                 cd.setMaCuDan(rs.getInt("MaCuDan")); 
                cd.setHoTen(rs.getString("HoTen"));
                cd.setSdt(rs.getString("SoDienThoai"));
                cd.setEmail(rs.getString("Email"));
                cd.setMaCanHo(rs.getInt("MaCanHo"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return cd;
    }
    
}
