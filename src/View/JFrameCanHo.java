
package View;

import Controller.CanHoController;
import Model.CanHo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameCanHo extends javax.swing.JFrame { 
private CanHoController Controller;

    public JFrameCanHo() {
        initComponents();
//        this.setLocationRelativeTo(null);
        Controller = new CanHoController();
        LoadTable();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    
  private void LoadTable() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("MaCanHo");
    model.addColumn("SoCanHo");
    model.addColumn("ToaNha");
    model.addColumn("Tang");
    model.addColumn("DienTich");

    // Thêm dữ liệu từ danh sách CanHo vào bảng
    for (CanHo canho : Controller.getAllCanHo()) {
        model.addRow(new Object[]{
            canho.getMaCanHo(),       
            canho.getSoCanHo(),       
            canho.getToaNha(),        
            canho.getTang(),          
            canho.getDienTich()      
        });
    }
    DvgCanHo.setModel(model); 
}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DvgCanHo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaCanHo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoCanHo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDienTich = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtToaNha = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        btnQLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        DvgCanHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DvgCanHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DvgCanHoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DvgCanHo);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mã căn hộ :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Số căn hộ :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Tầng :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Diện tích :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tòa nhà :");

        txtToaNha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToaNhaActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQLai)
                    .addComponent(btnLammoi))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtToaNha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 181, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(433, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSua)
                                .addGap(62, 62, 62)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiem)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtToaNha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimkiem)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnLammoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnQLai))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Chuc năng Thêm
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        int row = DvgCanHo.getSelectedRow();
        if (row == -1) {
            // Hiển thị thông báo lỗi nếu không có dòng được chọn
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng điền thông tin để thêm căn hộ.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String soCanHo = txtSoCanHo.getText().trim();
            String toaNha = txtToaNha.getText().trim();
            int tang = Integer.parseInt(txtTang.getText().trim());
            float dienTich = Float.parseFloat(txtDienTich.getText().trim());

            CanHo canHo = new CanHo(0, soCanHo);

            Controller.addCanHo(canHo);
            txtMaCanHo.setText("");
            txtSoCanHo.setText("");
            txtToaNha.setText("");
            txtTang.setText("");
            txtDienTich.setText("");
            
            LoadTable();

            javax.swing.JOptionPane.showMessageDialog(this, "Thêm căn hộ thành công!");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "<html><div style='text-align: center; width: 150px; padding-right: 39px;'>Lỗi cú pháp</div></html>");
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnThemMouseClicked
// chức năng sừa
    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
       int row = DvgCanHo.getSelectedRow();
if (row == -1) {
    // Hiển thị thông báo lỗi nếu không có dòng được chọn
    javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một căn hộ để sửa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
    return;
}

try {
    // Lấy ID từ dòng đã chọn
    int id = Integer.parseInt(DvgCanHo.getValueAt(row, 0).toString()); // Thay đổi ở đây
    String Socanho = txtSoCanHo.getText().trim();
    String Toanha = txtToaNha.getText().trim();
    int Tang = Integer.parseInt(txtTang.getText().trim());
    float Dientich = Float.parseFloat(txtDienTich.getText().trim());

    // Tạo đối tượng CanHo với ID hợp lệ
    CanHo canho = new CanHo(id, Socanho, Toanha, Tang, Dientich); // Chú ý sửa lại constructor để bao gồm ID

    // Gọi phương thức cập nhật căn hộ
    Controller.updateCanHo(canho); 

    // Cập nhật lại bảng dữ liệu
    LoadTable(); 

    // Làm sạch các trường nhập liệu
    txtMaCanHo.setText("");
    txtSoCanHo.setText("");
    txtToaNha.setText("");
    txtTang.setText("");
    txtDienTich.setText("");

    // Hiển thị thông báo thành công
    javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
} catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Lỗi nhập liệu. Vui lòng kiểm tra lại thông tin!", "Thông báo", javax.swing.JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Thông báo", javax.swing.JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}


    }//GEN-LAST:event_btnSuaMouseClicked
// chức năng xóa
    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int row = DvgCanHo.getSelectedRow();
        if (row == -1) {
            // Hiển thị thông báo lỗi nếu không có dòng được chọn
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một căn hộ để xóa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Lấy ID từ dòng đã chọn trong bảng
            int id = Integer.parseInt(DvgCanHo.getValueAt(row, 0).toString()); // Lấy ID từ cột đầu tiên (0) của dòng đã chọn

            // Kiểm tra xem căn hộ có còn cư dân nào tham chiếu không
            if (Controller.checkCudanExistByMaCanHo(id)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Không thể xóa căn hộ này vì còn cư dân tham chiếu!", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Gọi phương thức xóa căn hộ
            Controller.deleteCanHo(id);

            // Xóa các trường nhập liệu
            txtMaCanHo.setText("");
            txtSoCanHo.setText("");
            txtToaNha.setText("");
            txtTang.setText("");
            txtDienTich.setText("");

            // Cập nhật lại bảng dữ liệu
            LoadTable();

            // Hiển thị thông báo thành công
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi định dạng ID. Vui lòng kiểm tra lại.", "Thông báo", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Thông báo", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnXoaMouseClicked
// Chức năng tìm kiếm 
    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked

        String keyword = txtTimkiem.getText().trim();
        if (!keyword.isEmpty()) {
            List<CanHo> searchResults = Controller.searchCanHo(keyword);
            if (!searchResults.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("MaCanHo");
                model.addColumn("SoCanHo");
                model.addColumn("ToaNha");
                model.addColumn("Tang");
                model.addColumn("DienTich");

                for (CanHo canho : searchResults) {
                    model.addRow(new Object[]{canho.getMaCanHo(), canho.getSoCanHo(), canho.getToaNha(), canho.getTang(), canho.getDienTich()});
                }
                DvgCanHo.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy danh mục nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void DvgCanHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvgCanHoMouseClicked
        int row = DvgCanHo.getSelectedRow();

        if (row >= 0) {
            // Lấy giá trị từ các cột
            txtMaCanHo.setText(DvgCanHo.getValueAt(row, 0).toString());
            txtSoCanHo.setText(DvgCanHo.getValueAt(row, 1).toString());
            txtToaNha.setText(DvgCanHo.getValueAt(row, 2).toString());
            txtTang.setText(DvgCanHo.getValueAt(row, 3).toString());
            txtDienTich.setText(DvgCanHo.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_DvgCanHoMouseClicked

    private void txtToaNhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToaNhaActionPerformed
      
    }//GEN-LAST:event_txtToaNhaActionPerformed

    private void btnLammoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseClicked
        txtMaCanHo.setText("");
        txtSoCanHo.setText("");
        txtToaNha.setText("");
        txtTang.setText("");
        txtDienTich.setText("");
        txtTimkiem.setText("");
        LoadTable();
    }//GEN-LAST:event_btnLammoiMouseClicked

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
         
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void btnQLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLaiMouseClicked
         // Mở form Home 
                JFrameHome homeFrame = new JFrameHome(); // Khởi tạo đối tượng JFrameHome
                homeFrame.setVisible(true); // Hiển thị form Home
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_btnQLaiMouseClicked

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCanHo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DvgCanHo;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDienTich;
    private javax.swing.JTextField txtMaCanHo;
    private javax.swing.JTextField txtSoCanHo;
    private javax.swing.JTextField txtTang;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtToaNha;
    // End of variables declaration//GEN-END:variables
}
