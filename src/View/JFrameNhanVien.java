
package View;


import Controller.NhanVienController;
import Model.NhanVien;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFrameNhanVien extends javax.swing.JFrame {
 private NhanVienController Controller;

    public JFrameNhanVien() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        Controller = new NhanVienController();
        LoadTable();
    }
 
    
    private void LoadTable() throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaNhanVien");
        model.addColumn("HoTen");
        model.addColumn("VaiTro");
        model.addColumn("SoDienTHoai");

        for (NhanVien nhanvien : Controller.getallNhanVien()) {
            model.addRow(new Object[]{nhanvien.getMaNhanVien(), nhanvien.getHoTen(),nhanvien.getVaiTro(), nhanvien.getSdt()});
        }
        DvgNhanVien.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtVaiTro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DvgNhanVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        btnQLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Họ Tên :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Số điện thoại :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Vai trò :");

        DvgNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        DvgNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DvgNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DvgNhanVien);

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });

        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        btnLammoi.setText("Làm mới");
        btnLammoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLammoiMouseClicked(evt);
            }
        });

        btnQLai.setText("Quay lại!");
        btnQLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLammoi)
                    .addComponent(btnQLai))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(38, 38, 38)
                        .addComponent(btnSua)
                        .addGap(52, 52, 52)
                        .addComponent(btnXoa)
                        .addGap(57, 57, 57)
                        .addComponent(btnTimkiem)
                        .addGap(29, 29, 29)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSua))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa)
                        .addComponent(btnTimkiem)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLammoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQLai)
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        try {
          
            String name = txtHoTen.getText();
            String vaitro = txtVaiTro.getText();
            String sdt = txtSdt.getText();

            // Kiểm tra nếu tên không được nhập
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Cú pháp chưa chính xác, cần thực hiện lại");
            }

            // Tạo đối tượng nhân viên và thiết lập các giá trị
            NhanVien nhanvien = new NhanVien();
            nhanvien.setHoTen(name);
            nhanvien.setVaiTro(vaitro);
            nhanvien.setSdt(sdt);
            
          

            // Thêm nhân viên vào cơ sở dữ liệu
            Controller.addNhanVien(nhanvien);

            // Tải lại bảng dữ liệu
            txtHoTen.setText("");
            txtVaiTro.setText("");
            txtSdt.setText("");
            LoadTable();
            
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra, vui lòng thử lại.");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
         try {
            int id = Integer.parseInt(txtID.getText());
            String Hoten = txtHoTen.getText();
            String Vaitro= txtVaiTro.getText();
            String sdt = txtSdt.getText();
           NhanVien nhanvien = new NhanVien(id , Hoten, Vaitro, sdt); // Tạo đối tượng với các giá trị đã lấy từ giao diện

            Controller.updateNhanVien(nhanvien);
            LoadTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
        } catch (SQLException ex) {
             javax.swing.JOptionPane.showMessageDialog(this, "Lỗi!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
      
    }

    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked

         try {
            int id = Integer.parseInt(txtID.getText());
            Controller.deleteNhanVien(id);
            txtHoTen.setText("");
            txtVaiTro.setText("");
            txtSdt.setText("");
            LoadTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
        } catch (SQLException ex) {
        Logger.getLogger(JFrameDichVu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked

         String keyword = txtTimkiem.getText().trim();
    if (!keyword.isEmpty()) {
        List<NhanVien> searchResults = Controller.searchNhanVien(keyword);
        if (searchResults != null && !searchResults.isEmpty()) { 
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("MaNhanVien");
            model.addColumn("HoTen");
            model.addColumn("VaiTro");
            model.addColumn("SoDienThoai");

            // Duyệt qua danh sách kết quả tìm kiếm và thêm vào model
            for (NhanVien nhanvien : searchResults) {
                model.addRow(new Object[]{nhanvien.getMaNhanVien(), nhanvien.getHoTen(), nhanvien.getVaiTro(), nhanvien.getSdt()});
            }
            
            txtHoTen.setText("");
            txtVaiTro.setText("");
            txtSdt.setText("");
            txtTimkiem.setText("");
            DvgNhanVien.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy dịch vụ nào hoặc cú pháp lỗi!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void btnLammoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseClicked
        txtID.setText("");
        txtHoTen.setText("");
        txtVaiTro.setText("");
        txtSdt.setText("");
        txtTimkiem.setText("");
        try {
            LoadTable();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLammoiMouseClicked

    private void DvgNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvgNhanVienMouseClicked
        int row = DvgNhanVien.getSelectedRow();
        txtID.setText(DvgNhanVien.getValueAt(row, 0).toString());
        txtHoTen.setText(DvgNhanVien.getValueAt(row, 1).toString());
        txtVaiTro.setText(DvgNhanVien.getValueAt(row, 2).toString());
        txtSdt.setText(DvgNhanVien.getValueAt(row, 3).toString());
    }//GEN-LAST:event_DvgNhanVienMouseClicked

    private void btnQLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLaiMouseClicked
        // Mở form Home 
                JFrameHome homeFrame = new JFrameHome(); // Khởi tạo đối tượng JFrameHome
                homeFrame.setVisible(true); // Hiển thị form Home
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_btnQLaiMouseClicked

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameNhanVien().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DvgNhanVien;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnQLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtVaiTro;
    // End of variables declaration//GEN-END:variables
}
