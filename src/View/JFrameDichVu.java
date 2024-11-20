
package View;

import Controller.DichVuController;
import Model.DichVu;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFrameDichVu extends javax.swing.JFrame {
private DichVuController Controller;
   
    public JFrameDichVu() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null); 
        Controller = new DichVuController();
        LoadTable();
    }

     private void LoadTable() throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaDichVu");
        model.addColumn("TenDichVu");
        model.addColumn("Gia");

        for (DichVu dichvu : Controller.getallDichVu()) {
            model.addRow(new Object[]{dichvu.getMaDichVu(), dichvu.getTenDichVu(),dichvu.getGia()});
        }
        DvgDichVu.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        txtTenDichVu = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DvgDichVu = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Tên dịch vụ :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã dịch vụ :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Giá :");

        DvgDichVu.setModel(new javax.swing.table.DefaultTableModel(
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
        DvgDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DvgDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DvgDichVu);

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnthoat.setText("Thoát");
        btnthoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthoatMouseClicked(evt);
            }
        });

        btnLammoi.setText("Làm mới");
        btnLammoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLammoiMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnthoat)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaDichVu)
                            .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnThem)
                        .addGap(40, 40, 40)
                        .addComponent(btnSua)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoa)
                        .addGap(45, 45, 45)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimkiem)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLammoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnthoat)
                        .addGap(41, 41, 41))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DvgDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvgDichVuMouseClicked
        int row = DvgDichVu.getSelectedRow();
        txtMaDichVu.setText(DvgDichVu.getValueAt(row, 0).toString());
        txtTenDichVu.setText(DvgDichVu.getValueAt(row, 1).toString());
        txtGia.setText(DvgDichVu.getValueAt(row, 2).toString());
    }//GEN-LAST:event_DvgDichVuMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        try {
            String name = txtTenDichVu.getText();
            
            if(name.isEmpty()){
            throw new IllegalArgumentException("Cú pháp chưa chính xác, cần thực hiện lại");
            }
            DichVu dichvu = new DichVu(WIDTH, name, TOP_ALIGNMENT);
            Controller.addDichVu(dichvu);
            LoadTable();
            txtTenDichVu.setText("");
            txtMaDichVu.setText("");
            txtGia.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
             javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }catch (Exception e) {
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        try {
            int id = Integer.parseInt(txtMaDichVu.getText());
            String name = txtTenDichVu.getText();
            float gia= Float.parseFloat(txtGia.getText());
            DichVu dichvu = new DichVu(id, name, gia); // Tạo đối tượng với các giá trị đã lấy từ giao diện

            Controller.updateDichVu(dichvu);
            LoadTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
        } catch (SQLException ex) {
        Logger.getLogger(JFrameDichVu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        try {
            int id = Integer.parseInt(txtMaDichVu.getText());
            Controller.deleteDichVu(id);
            LoadTable();
            txtMaDichVu.setText("");
            txtTenDichVu.setText("");
            txtGia.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
        } catch (SQLException ex) {
        Logger.getLogger(JFrameDichVu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked
         String keyword = txtTimkiem.getText().trim();
    if (!keyword.isEmpty()) {
        List<DichVu> searchResults = Controller.searchDichVu(keyword);
        if (searchResults != null && !searchResults.isEmpty()) {  // Kiểm tra null và rỗng
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("MaDichVu");
            model.addColumn("TenDichVu");
            model.addColumn("Gia");         

            // Duyệt qua danh sách kết quả tìm kiếm và thêm vào model
            for (DichVu dichvu : searchResults) {
                model.addRow(new Object[]{dichvu.getMaDichVu(), dichvu.getTenDichVu(), dichvu.getGia()});
            }
            
            txtMaDichVu.setText("");
            txtTenDichVu.setText("");
            txtGia.setText("");
            txtTimkiem.setText("");
            DvgDichVu.setModel(model);  
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy dịch vụ nào hoặc cú pháp lỗi!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void btnLammoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseClicked
        txtMaDichVu.setText("");
        txtTenDichVu.setText("");
        txtGia.setText("");
        txtTimkiem.setText("");
    try {
        LoadTable();
    } catch (SQLException ex) {
        Logger.getLogger(JFrameDichVu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnLammoiMouseClicked

    private void btnthoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthoatMouseClicked
        // Mở form Home 
                JFrameHome homeFrame = new JFrameHome(); // Khởi tạo đối tượng JFrameHome
                homeFrame.setVisible(true); // Hiển thị form Home
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_btnthoatMouseClicked

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameDichVu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DvgDichVu;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtTenDichVu;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
