package View;

import Controller.CanHoController;
import Controller.CuDanController;
import Controller.HopDongController;
import Model.CanHo;
import Model.CuDan;
import Model.HopDong;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameHopDong extends javax.swing.JFrame {

    private HopDongController Controller;
    private CanHoController CanHoController;
    private CuDanController CuDanController;

    public JFrameHopDong() {
        initComponents();
        this.setLocationRelativeTo(null);
        Controller = new HopDongController();
        CanHoController = new CanHoController();
        CuDanController = new CuDanController();
        loadTable();
        loadCanHo();
        loadCuDan();
    }

    public void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaHopDong");
        model.addColumn("MaCuDan");
        model.addColumn("MaCanHo");
        model.addColumn("NgayBatDau");
        model.addColumn("NgayKetThuc");

        // Thêm dữ liệu từ danh sách HopDong vào bảng
        for (HopDong hopdong : Controller.getAllHopDong()) {
            model.addRow(new Object[]{
                hopdong.getMaHopDong(),
                hopdong.getMaCuDan(),
                hopdong.getMaCanHo(),
                hopdong.getNgayBatDau(),
                hopdong.getNgayKetThuc()
            });
        }
        // Gán model vào bảng sau khi thêm hết các hàng
        DvgHopDong.setModel(model);
    }

    private void loadCanHo() {

        List<CanHo> canHoList = CanHoController.getAllCanHo();
        cbbMaCanHo.removeAllItems();
        if (canHoList.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No MaCanHo available");
            return;
        }
        for (CanHo i : canHoList) {
            cbbMaCanHo.addItem(i.getToaNha());
            System.out.println("Ma Can Ho: " + i.getMaCanHo());
        }
    }

    private void loadCuDan() {

        List<CuDan> cudanlist = CuDanController.getAllCuDan();
        ccbMaCuDan.removeAllItems();
        if (cudanlist.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No MaCuDan available");
            return;
        }
        for (CuDan i : cudanlist) {
            ccbMaCuDan.addItem(i.getHoTen());
            System.out.println("Ma Cu Dan: " + i.getMaCuDan());
        }
    }

// Phương thức để lấy tên can ho từ ID 
    private String getCanHoById(int id) {
        try {

            CanHo canHo = CanHoController.getCanHoById(id);
            if (canHo != null) {
                return canHo.getToaNha();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức để lấy tên can ho từ ID 
    private String getCuDanById(int id) {
        try {

            CuDan cudan = CuDanController.getCuDanById(id);
            if (cudan != null) {
                return cudan.getHoTen();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaHopDong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ccbMaCuDan = new javax.swing.JComboBox<>();
        cbbMaCanHo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        txtNgayBatDau = new javax.swing.JTextField();
        BtnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnXOa = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DvgHopDong = new javax.swing.JTable();
        txtNgayKetThuc = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mã cư dân :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã hợp đồng :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Mã căn hộ :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Ngày bắt đầu :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Ngày kết thúc :");

        BtnThem.setText("Thêm");
        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnThemMouseClicked(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });

        btnXOa.setText("Xóa");
        btnXOa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXOaMouseClicked(evt);
            }
        });

        jButton6.setText("Thoát");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        DvgHopDong.setModel(new javax.swing.table.DefaultTableModel(
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
        DvgHopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DvgHopDongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DvgHopDong);

        txtNgayKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayKetThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ccbMaCuDan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnThem)
                                .addGap(42, 42, 42)
                                .addComponent(btnSua)
                                .addGap(52, 52, 52)
                                .addComponent(btnXOa)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTimKiem)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cbbMaCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoi)
                    .addComponent(jButton6))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ccbMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbMaCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnThem)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXOa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayKetThucActionPerformed

    private void DvgHopDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvgHopDongMouseClicked
        int row = DvgHopDong.getSelectedRow();

        if (row >= 0) {
            // Lấy giá trị từ các cột
            txtMaHopDong.setText(DvgHopDong.getValueAt(row, 0).toString());

            // Lấy MaCuDan
            int MaCuDan = Integer.parseInt(DvgHopDong.getValueAt(row, 1).toString());
            String MaCuDanName = getCuDanById(MaCuDan);
            ccbMaCuDan.setSelectedItem(MaCuDanName);

            // Lấy MaCanHo
            int MaCanHo = Integer.parseInt(DvgHopDong.getValueAt(row, 2).toString());
            String MaCanHoName = getCanHoById(MaCanHo);
            cbbMaCanHo.setSelectedItem(MaCanHoName);

            // Đặt giá trị cho NgayBatDau và NgayKetThuc
            txtNgayBatDau.setText(DvgHopDong.getValueAt(row, 3).toString());
            txtNgayKetThuc.setText(DvgHopDong.getValueAt(row, 4).toString());

            loadTable();
        }

    }//GEN-LAST:event_DvgHopDongMouseClicked

    private void BtnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnThemMouseClicked
        int row = DvgHopDong.getSelectedRow();

        int id = Integer.parseInt(txtMaHopDong.getText().trim());
        try {
            int selectedIndex1 = ccbMaCuDan.getSelectedIndex();
            if (selectedIndex1 == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã cư dân!");
                return;
            }
            int macudan = CuDanController.getAllCuDan().get(selectedIndex1).getMaCuDan();

            int selectedIndex2 = cbbMaCanHo.getSelectedIndex();
            if (selectedIndex2 == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã căn hộ!");
                return;
            }
            int macanho = CanHoController.getAllCanHo().get(selectedIndex2).getMaCanHo();

            // Kiểm tra nếu NgayBatDau và NgayKetThuc không trống trước khi tạo HopDong
            // Kiểm tra nếu NgayBatDau và NgayKetThuc không trống trước khi tạo HopDong
            String NgayBatDauStr = txtNgayBatDau.getText().trim();
            String NgayKetThucStr = txtNgayKetThuc.getText().trim();

            if (NgayBatDauStr.isEmpty() || NgayKetThucStr.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập Ngày bắt đầu và Ngày kết thúc!");
                return;
            }

            // Chuyển đổi từ String sang Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            Date NgayBatDau;
            Date NgayKetThuc;

            try {
                NgayBatDau = dateFormat.parse(NgayBatDauStr);
                NgayKetThuc = dateFormat.parse(NgayKetThucStr);
            } catch (ParseException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ (yyyy-MM-dd)!");
                return;
            }

            // Khởi tạo đối tượng HopDong và thiết lập các thuộc tính
            HopDong hopdong = new HopDong(id, macudan, macanho, NgayBatDau, NgayKetThuc);

            // Gọi phương thức thêm hop dong
            txtMaHopDong.setText("");
            txtNgayBatDau.setText("");
            txtNgayKetThuc.setText("");
            txtTimKiem.setText("");
            loadCanHo();
            loadCuDan();
            loadTable();
            Controller.addHopDong(hopdong);
            loadTable();

            javax.swing.JOptionPane.showMessageDialog(this, "Thêm hợp đồng thành công!");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "<html><div style='text-align: center; width: 150px; padding-right: 39px;'>Lỗi cú pháp</div></html>");
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_BtnThemMouseClicked

    private void btnLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseClicked
        txtMaHopDong.setText("");
        txtNgayBatDau.setText("");
        txtNgayKetThuc.setText("");
        txtTimKiem.setText("");
        loadCanHo();
        loadCuDan();
        loadTable();
    }//GEN-LAST:event_btnLamMoiMouseClicked

    private void btnXOaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXOaMouseClicked
        int row = DvgHopDong.getSelectedRow();
        if (row == -1) {
            // Hiển thị thông báo lỗi nếu không có dòng được chọn
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một cư dân để xóa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(txtMaHopDong.getText());
            Controller.deleteHopDong(id);
            txtNgayBatDau.setText("");
            txtNgayKetThuc.setText("");
            txtTimKiem.setText("");
            loadCanHo();
            loadCuDan();
            loadTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnXOaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        int row = DvgHopDong.getSelectedRow();

        int id = Integer.parseInt(txtMaHopDong.getText().trim());
        if (row == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một hợp đồng để sửa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int selectedIndex1 = ccbMaCuDan.getSelectedIndex();
        if (selectedIndex1 == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã cư dân!");
            return;
        }
        int macudan = CuDanController.getAllCuDan().get(selectedIndex1).getMaCuDan();

        int selectedIndex2 = cbbMaCanHo.getSelectedIndex();
        if (selectedIndex2 == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã căn hộ!");
            return;
        }
        int macanho = CanHoController.getAllCanHo().get(selectedIndex2).getMaCanHo();

// Kiểm tra nếu NgayBatDau và NgayKetThuc không trống trước khi tạo HopDong
        String NgayBatDau = txtNgayBatDau.getText().trim();
        String NgayKetThuc = txtNgayKetThuc.getText().trim();

        if (NgayBatDau.isEmpty() || NgayKetThuc.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập Ngày bắt đầu và Ngày kết thúc!");
            return;
        }

        Date ngayBatDau;
        Date ngayKetThuc;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            ngayBatDau = dateFormat.parse(NgayBatDau);
            ngayKetThuc = dateFormat.parse(NgayKetThuc);
        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ (yyyy-MM-dd)!");
            return;
        }

// Tạo đối tượng hopdong với thông tin cập nhật
        HopDong hopdong = new HopDong(id, macudan, macanho, ngayBatDau, ngayKetThuc);



// Gọi phương thức cập nhật hợp đồng trong Controller
        Controller.updateHopDong(hopdong);
        txtMaHopDong.setText("");
        txtNgayBatDau.setText("");
        txtNgayKetThuc.setText("");
        txtTimKiem.setText("");
        loadCanHo();
        loadCuDan();
        loadTable();

    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked

        String keyword = txtTimKiem.getText().trim();
        if (!keyword.isEmpty()) {
            List<HopDong> searchResults = Controller.searchHopDong(keyword);
            if (!searchResults.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("MaHopDong");
                model.addColumn("MaCuDan");
                model.addColumn("MaCanHo");
                model.addColumn("NgayBatDau");
                model.addColumn("NgayKetThuc");

                for (HopDong hopdong : searchResults) {
                    model.addRow(new Object[]{hopdong.getMaHopDong(), hopdong.getMaCuDan(), hopdong.getMaCanHo(), hopdong.getNgayBatDau(), hopdong.getNgayKetThuc()});
                }
                DvgHopDong.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy danh mục nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
         // Mở form Home 
                JFrameHome homeFrame = new JFrameHome(); // Khởi tạo đối tượng JFrameHome
                homeFrame.setVisible(true); // Hiển thị form Home
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_jButton6MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnThem;
    private javax.swing.JTable DvgHopDong;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXOa;
    private javax.swing.JComboBox<String> cbbMaCanHo;
    private javax.swing.JComboBox<String> ccbMaCuDan;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaHopDong;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
