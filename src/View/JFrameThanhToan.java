

package View;

import Controller.CuDanController;
import Controller.DichVuController;
import Controller.ThanhToanController;
import Model.CuDan;
import Model.DichVu;
import Model.ThanhToan;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFrameThanhToan extends javax.swing.JFrame {

   private ThanhToanController Controller;
   private CuDanController CuDanController;
    private DichVuController DichVuController;

    public JFrameThanhToan() throws SQLException {
        initComponents();
        CuDanController = new CuDanController();
        DichVuController = new DichVuController();
        Controller = new ThanhToanController();
        this.setLocationRelativeTo(null);
        loadTable();
        loadCuDan();
        loadDichVu();
    }

     public void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaThanhToan");
        model.addColumn("MaCuDan");
        model.addColumn("MaDichVu");
        model.addColumn("SoTien");
        model.addColumn("NgayThanhToan");

        // Thêm dữ liệu từ danh sách HopDong vào bảng
        for (ThanhToan thanhtoan : Controller.getallThanhToan()) {
            model.addRow(new Object[]{
                thanhtoan.getMaThanhToan(),
                thanhtoan.getMaCuDan(),
                thanhtoan.getMaDichVu(),
                thanhtoan.getSoTien(),
                thanhtoan.getNgayThanhToan()
            });
        }

        DvgThanhToan.setModel(model);
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

    private void loadDichVu() throws SQLException {

        List<DichVu> dichvulist = DichVuController.getallDichVu();
        cbbMaDichVu.removeAllItems();
        if (dichvulist.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No MaDichVu available");
            return;
        }
        for (DichVu i : dichvulist) {
            cbbMaDichVu.addItem(i.getTenDichVu());
            System.out.println("Ma Dich Vu: " + i.getMaDichVu());
        }
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

    // Phương thức để lấy tên dichvu từ ID 
    private String getdichvuById(int id) {
        try {

            DichVu dichvu = DichVuController.getDichVuById(id);
            if (dichvu != null) {
                return dichvu.getTenDichVu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnXOa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        BtnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ccbMaCuDan = new javax.swing.JComboBox<>();
        cbbMaDichVu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNgaythanhtoan = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMaThanhtoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DvgThanhToan = new javax.swing.JTable();
        btnXOa1 = new javax.swing.JButton();
        txtTimKiem1 = new javax.swing.JTextField();
        BtnThem1 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        btnTimKiem1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();

        btnXOa.setText("Xóa");
        btnXOa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXOaMouseClicked(evt);
            }
        });

        BtnThem.setText("Thêm");
        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnThemMouseClicked(evt);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Mã dịch vụ :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Số tiền :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Ngày Thanh toán :");

        txtNgaythanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaythanhtoanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mã cư dân :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã thanh toán :");

        DvgThanhToan.setModel(new javax.swing.table.DefaultTableModel(
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
        DvgThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DvgThanhToanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DvgThanhToan);

        btnXOa1.setText("Xóa");
        btnXOa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXOa1MouseClicked(evt);
            }
        });

        txtTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiem1ActionPerformed(evt);
            }
        });

        BtnThem1.setText("Thêm");
        BtnThem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnThem1MouseClicked(evt);
            }
        });

        btnSua1.setText("Sửa");
        btnSua1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSua1MouseClicked(evt);
            }
        });

        btnTimKiem1.setText("Tìm kiếm");
        btnTimKiem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiem1MouseClicked(evt);
            }
        });

        jButton6.setText("Thoát");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ccbMaCuDan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMaThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cbbMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnThem1)
                        .addGap(42, 42, 42)
                        .addComponent(btnSua1)
                        .addGap(52, 52, 52)
                        .addComponent(btnXOa1)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTimKiem1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaythanhtoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ccbMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgaythanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnThem1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXOa1)
                        .addComponent(btnTimKiem1)
                        .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSua1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLamMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(45, 45, 45))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgaythanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaythanhtoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaythanhtoanActionPerformed

    private void btnXOaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXOaMouseClicked

    }//GEN-LAST:event_btnXOaMouseClicked

    private void BtnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnThemMouseClicked

    }//GEN-LAST:event_BtnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked

    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked

    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnXOa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXOa1MouseClicked
        int row = DvgThanhToan.getSelectedRow();
        if (row == -1) {
            // Hiển thị thông báo lỗi nếu không có dòng được chọn
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một thanh toán để xóa.", "Thông báo", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(txtMaThanhtoan.getText());
            Controller.deleteThanhToan(id);
            txtMaThanhtoan.setText("");
            txtNgaythanhtoan.setText("");
            txtTimKiem.setText("");
            txtSoTien.setText("");

            loadCuDan();
            loadTable();
            loadDichVu();
            javax.swing.JOptionPane.showMessageDialog(this, "Thực hiện thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXOa1MouseClicked

    private void BtnThem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnThem1MouseClicked
        int row = DvgThanhToan.getSelectedRow();
        String maThanhToanText = txtMaThanhtoan.getText().trim();

        if (maThanhToanText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Mã thanh toán không được để trống!");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(maThanhToanText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Mã thanh toán phải là số nguyên hợp lệ!");
            return;
        }

        try {
            int selectedIndex1 = ccbMaCuDan.getSelectedIndex();
            if (selectedIndex1 == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã cư dân!");
                return;
            }
            int macudan = CuDanController.getAllCuDan().get(selectedIndex1).getMaCuDan();

            int selectedIndex2 = cbbMaDichVu.getSelectedIndex();
            if (selectedIndex2 == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 mã dịch vụ!");
                return;
            }
            int madichvu = DichVuController.getallDichVu().get(selectedIndex2).getMaDichVu();

            String sotien = txtSoTien.getText().trim();
            String ngaythanhtoan = txtNgaythanhtoan.getText().trim();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            Date NgayThanhToan;

            try {
                NgayThanhToan = dateFormat.parse(ngaythanhtoan);
            } catch (ParseException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ (yyyy-MM-dd)!");
                return;
            }

            ThanhToan thanhtoan = new ThanhToan(id, macudan, madichvu, Float.parseFloat(sotien), NgayThanhToan);

            loadCuDan();
            loadTable();
            Controller.addThanhToan(thanhtoan);
            loadTable();

            javax.swing.JOptionPane.showMessageDialog(this, "Thêm thanh toán thành công!");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "<html><div style='text-align: center; width: 150px; padding-right: 39px;'>Lỗi cú pháp</div></html>");
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_BtnThem1MouseClicked

    private void btnSua1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSua1MouseClicked
        int row = DvgThanhToan.getSelectedRow();
        int id = Integer.parseInt(txtMaThanhtoan.getText().trim());
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

        int selectedIndex2 = cbbMaDichVu.getSelectedIndex();
        if (selectedIndex2 == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 Mã dich vụ!");
            return;
        }

// Khai báo madichvu ở đây
        int madichvu = 0;

        try {
            // Gán giá trị cho madichvu trong khối try
            madichvu = DichVuController.getallDichVu().get(selectedIndex2).getMaDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameThanhToan.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi lấy mã dịch vụ: " + ex.getMessage());
            return; // Thoát nếu có lỗi
        }

        String SotienStr = txtSoTien.getText().trim();
        float Sotien;

        try {
            // Chuyển đổi chuỗi sang kiểu float
            Sotien = Float.parseFloat(SotienStr);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Số tiền phải là một số hợp lệ!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; // Thoát nếu không hợp lệ
        }

        String Ngaythanhtoan = txtNgaythanhtoan.getText().trim();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        java.util.Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(Ngaythanhtoan);  // Chuyển đổi String thành Date
        } catch (ParseException ex) {
            Logger.getLogger(JFrameThanhToan.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(this, "Ngày thanh toán không hợp lệ!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

// Nếu chuyển đổi thành công, tiếp tục tạo đối tượng ThanhToan
        ThanhToan thanhtoan = new ThanhToan(id, macudan, madichvu, Sotien, parsedDate);

// Gọi phương thức cập nhật thanh toán trong Controller
        Controller.updateThanhToan(thanhtoan);
        txtMaThanhtoan.setText("");
        txtNgaythanhtoan.setText("");
        txtSoTien.setText("");
        txtTimKiem.setText("");
        loadCuDan();
        loadTable();
        try {
            loadDichVu();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSua1MouseClicked

    private void btnTimKiem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiem1MouseClicked

        String keyword = txtTimKiem1.getText().trim();
        if (!keyword.isEmpty()) {
            List<ThanhToan> searchResults = Controller.searchThanhTOan(keyword);
            if (!searchResults.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("MaThanhToan");
                model.addColumn("MaCuDan");
                model.addColumn("MaDichVu");
                model.addColumn("SoTien");
                model.addColumn("NgayThanhToan");

                for (ThanhToan thanhtoan : searchResults) {
                    model.addRow(new Object[]{thanhtoan.getMaThanhToan(), thanhtoan.getMaCuDan(), thanhtoan.getMaDichVu(), thanhtoan.getSoTien(), thanhtoan.getNgayThanhToan()});
                }
                DvgThanhToan.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy danh mục nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiem1MouseClicked

    private void txtTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiem1ActionPerformed

    private void btnLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseClicked
       try {
           txtMaThanhtoan.setText("");
           txtNgaythanhtoan.setText("");
           txtSoTien.setText("");
           txtTimKiem.setText("");
           loadCuDan();
           loadTable();
           loadDichVu();
       } catch (SQLException ex) {
           Logger.getLogger(JFrameThanhToan.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnLamMoiMouseClicked

    private void DvgThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvgThanhToanMouseClicked
        int row = DvgThanhToan.getSelectedRow();

        if (row >= 0) {
            // Lấy giá trị từ các cột
            txtMaThanhtoan.setText(DvgThanhToan.getValueAt(row, 0).toString());

            // Lấy MaCuDan
            int MaCuDan = Integer.parseInt(DvgThanhToan.getValueAt(row, 1).toString());
            String MaCuDanName = getCuDanById(MaCuDan);
            ccbMaCuDan.setSelectedItem(MaCuDanName);

            // Lấy MaDichvu
            int Madichvu = Integer.parseInt(DvgThanhToan.getValueAt(row, 2).toString());
            String MadichvuName = getdichvuById(Madichvu);
            cbbMaDichVu.setSelectedItem(MadichvuName);

            txtSoTien.setText(DvgThanhToan.getValueAt(row, 3).toString());
            txtNgaythanhtoan.setText(DvgThanhToan.getValueAt(row, 4).toString());

            loadTable();
        }

    }//GEN-LAST:event_DvgThanhToanMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
         // Mở form Home 
                JFrameHome homeFrame = new JFrameHome(); // Khởi tạo đối tượng JFrameHome
                homeFrame.setVisible(true); // Hiển thị form Home
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_jButton6MouseClicked


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameThanhToan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameThanhToan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnThem1;
    private javax.swing.JTable DvgThanhToan;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JButton btnXOa;
    private javax.swing.JButton btnXOa1;
    private javax.swing.JComboBox<String> cbbMaDichVu;
    private javax.swing.JComboBox<String> ccbMaCuDan;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMaThanhtoan;
    private javax.swing.JTextField txtNgaythanhtoan;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiem1;
    // End of variables declaration//GEN-END:variables

}
