package View;

import Controller.CanHoController;
import Controller.CuDanController;
import Model.CanHo;
import Model.CuDan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameCuDan extends javax.swing.JFrame {

    CuDanController Controller;
    private CanHoController canHoController;

    public JFrameCuDan() {
        initComponents();
        this.setLocationRelativeTo(null);
        Controller = new CuDanController();      
        canHoController = new CanHoController();
        LoadTable();
        loadCanHo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaCuDan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DvgCuDan = new javax.swing.JTable();
        btnLammoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnQLai = new javax.swing.JButton();
        ccbMaCanHo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Họ tên :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Mã căn hộ :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Số điện thoại :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Email :");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

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

        DvgCuDan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DvgCuDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DvgCuDanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DvgCuDan);

        btnLammoi.setText("Làm mới");
        btnLammoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLammoiMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mã cư dân :");

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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLammoi)
                    .addComponent(btnQLai))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(36, 36, 36)
                        .addComponent(btnSua)
                        .addGap(52, 52, 52)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiem)
                        .addGap(29, 29, 29)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ccbMaCanHo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ccbMaCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimkiem)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnLammoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQLai)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaCunDan");
        model.addColumn("HoTen");
        model.addColumn("SoDienThoai");
        model.addColumn("Email");
        model.addColumn("MaCanHo");

        // Thêm dữ liệu từ danh sách CanHo vào bảng
        for (CuDan cudan : Controller.getAllCuDan()) {
            model.addRow(new Object[]{
                cudan.getMaCuDan(),
                cudan.getHoTen(),
                cudan.getSdt(),
                cudan.getEmail(),
                cudan.getMaCanHo()
            });
            DvgCuDan.setModel(model);
        }

    }

    private void loadCanHo() {

        List<CanHo> canHoList = canHoController.getAllCanHo();
        ccbMaCanHo.removeAllItems();
        if (canHoList.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No MaCanHo available");
            return;
        }
        for (CanHo i : canHoList) {
            ccbMaCanHo.addItem(i.getToaNha());
            System.out.println("Ma Can Ho: " + i.getMaCanHo());
        }
    }

// Phương thức để lấy tên category từ ID 
    private String getCanHoById(int id) {
        try {

            CanHo canHo = canHoController.getCanHoById(id);
            if (canHo != null) {
                return canHo.getToaNha();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        int row = DvgCuDan.getSelectedRow();
//        if (row == -1) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng điền thông tin để thêm cư dân.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        try {
            String HoTen = txtHoTen.getText().trim();
            String Sdt = txtSdt.getText().trim();
            String Email = txtEmail.getText().trim();
            int selectedIndex = ccbMaCanHo.getSelectedIndex();

            if (selectedIndex == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã căn hộ!");
                return; // Thoát phương thức nếu không có mã căn hộ được chọn
            }

            int macanho = canHoController.getAllCanHo().get(selectedIndex).getMaCanHo();
            CuDan cudan = new CuDan(macanho, HoTen, Sdt, Email, macanho);

            // Gọi phương thức thêm cư dân
            Controller.adđCuDan(cudan);

            // Xóa các trường sau khi thêm thành công
            txtMaCuDan.setText("");
            txtHoTen.setText("");
            txtEmail.setText("");
            txtSdt.setText("");
            loadCanHo();
            // Tải lại bảng để hiển thị dữ liệu mới
            LoadTable();

            javax.swing.JOptionPane.showMessageDialog(this, "Thêm cư dân thành công!");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "<html><div style='text-align: center; width: 150px; padding-right: 39px;'>Lỗi cú pháp</div></html>");
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        int row = DvgCuDan.getSelectedRow();

// Kiểm tra nếu không có dòng nào được chọn
        if (row == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một cư dân để sửa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Lấy ID từ dòng đã chọn
            int id = Integer.parseInt(DvgCuDan.getValueAt(row, 0).toString());

            // Lấy các giá trị từ các trường nhập liệu
            String Hoten = txtHoTen.getText().trim();
            String Sdt = txtSdt.getText().trim();
            String Email = txtEmail.getText().trim();

            // Lấy giá trị MaCanHo từ ComboBox và kiểm tra xem có phải số không
            int selectedIndex =  ccbMaCanHo.getSelectedIndex();
           
             int MaCanHo = canHoController.getAllCanHo().get(selectedIndex).getMaCanHo();
          

            // Tạo đối tượng CuDan với thông tin cập nhật
            CuDan cudan = new CuDan(id, Hoten, Sdt, Email, MaCanHo);

            // Gọi phương thức cập nhật cư dân trong Controller
            Controller.updateCuDan(cudan);

            // Xóa các trường nhập liệu sau khi cập nhật thành công
            txtMaCuDan.setText("");
            txtHoTen.setText("");
            txtEmail.setText("");
            txtSdt.setText("");

            // Tải lại dữ liệu sau khi cập nhật
            loadCanHo();
            LoadTable();

            // Hiển thị thông báo thành công
            javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật cư dân thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi nhập liệu. Vui lòng kiểm tra lại thông tin!", "Thông báo", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Thông báo", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked

        int row = DvgCuDan.getSelectedRow();
//        if (row == -1) {
//            // Hiển thị thông báo lỗi nếu không có dòng được chọn
//            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một cư dân để xóa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        try {
            int id = Integer.parseInt(txtMaCuDan.getText());
            Controller.deleteCuDan(id);
            txtMaCuDan.setText("");
            txtHoTen.setText("");
            txtEmail.setText("");
            txtSdt.setText("");
            loadCanHo();
            LoadTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked

        String keyword = txtTimkiem.getText().trim();
        if (!keyword.isEmpty()) {
            List<CuDan> searchResults = Controller.searchCuDan(keyword);
            if (!searchResults.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("MaCanHo");
                model.addColumn("SoCanHo");
                model.addColumn("ToaNha");
                model.addColumn("Tang");
                model.addColumn("DienTich");

                for (CuDan cudan : searchResults) {
                    model.addRow(new Object[]{cudan.getId(), cudan.getHoTen(), cudan.getSdt(), cudan.getEmail(), cudan.getMaCanHo()});
                }
                DvgCuDan.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy danh mục nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void DvgCuDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvgCuDanMouseClicked
        int row = DvgCuDan.getSelectedRow();

        if (row >= 0) {
            // Lấy giá trị từ các cột
            txtMaCuDan.setText(DvgCuDan.getValueAt(row, 0).toString());
            txtHoTen.setText(DvgCuDan.getValueAt(row, 1).toString());
            txtSdt.setText(DvgCuDan.getValueAt(row, 2).toString());
            txtEmail.setText(DvgCuDan.getValueAt(row, 3).toString());

            int MaCanHo =  Integer.parseInt(DvgCuDan.getValueAt(row, 4).toString());
            String MaCanHoName = getCanHoById(MaCanHo);
            if (MaCanHoName != null) {
                ccbMaCanHo.setSelectedItem(MaCanHoName);
            } else {
                ccbMaCanHo.setSelectedItem(null);
                System.out.println("MaCanHo not found for ID: " + MaCanHo);

            }

            LoadTable();

        }
    }//GEN-LAST:event_DvgCuDanMouseClicked

    private void btnLammoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseClicked
        txtMaCuDan.setText("");
        txtHoTen.setText("");
        txtEmail.setText("");
        txtSdt.setText("");
        txtTimkiem.setText("");
        loadCanHo();
        LoadTable();
    }//GEN-LAST:event_btnLammoiMouseClicked

    private void btnQLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLaiMouseClicked
         // Mở form Home 
                JFrameHome homeFrame = new JFrameHome(); // Khởi tạo đối tượng JFrameHome
                homeFrame.setVisible(true); // Hiển thị form Home
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_btnQLaiMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCuDan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DvgCuDan;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnQLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> ccbMaCanHo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaCuDan;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

    private boolean isMaCanHoExist(int maCanHo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
