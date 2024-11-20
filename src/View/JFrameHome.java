
package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JFrameHome extends javax.swing.JFrame {

   
    public JFrameHome() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cudan = new javax.swing.JLabel();
        Canho = new javax.swing.JLabel();
        dichvu = new javax.swing.JLabel();
        nhanvien = new javax.swing.JLabel();
        hopdong = new javax.swing.JLabel();
        thanhtoan = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to our software!");

        jLabel2.setBackground(new java.awt.Color(255, 51, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đồ Án Chuyên Ngành");
        jLabel2.setToolTipText("");

        cudan.setBackground(new java.awt.Color(102, 255, 102));
        cudan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cudan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cudan.setText("Cư dân");
        cudan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cudanMouseClicked(evt);
            }
        });

        Canho.setBackground(new java.awt.Color(51, 255, 51));
        Canho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Canho.setForeground(new java.awt.Color(51, 153, 255));
        Canho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Canho.setText("Căn hộ");
        Canho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanhoMouseClicked(evt);
            }
        });

        dichvu.setBackground(new java.awt.Color(230, 28, 28));
        dichvu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dichvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dichvu.setText("Dịch vụ");
        dichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dichvuMouseClicked(evt);
            }
        });

        nhanvien.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nhanvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nhanvien.setText("Nhân viên");
        nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhanvienMouseClicked(evt);
            }
        });

        hopdong.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        hopdong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hopdong.setText("Hợp đồng");
        hopdong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hopdongMouseClicked(evt);
            }
        });

        thanhtoan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        thanhtoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thanhtoan.setText("Thanh toán");
        thanhtoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thanhtoanMouseClicked(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cudan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Canho, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(583, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Canho, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cudan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void CanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanhoMouseClicked
        // Mở form Home 
                JFrameCanHo canho = new JFrameCanHo(); 
                canho.setVisible(true); // Hiển thị form căn hộ
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_CanhoMouseClicked

    private void cudanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cudanMouseClicked
         // Mở form Home 
                JFrameCuDan cudan = new JFrameCuDan(); 
               cudan.setVisible(true); // Hiển thị form cư dân
                this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_cudanMouseClicked

    private void hopdongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hopdongMouseClicked
        // Mở form Home 
        JFrameHopDong hopdong = new JFrameHopDong(); 
        hopdong.setVisible(true); // Hiển thị form hợp đồng
        this.dispose(); // Đóng form đăng nhập
    }//GEN-LAST:event_hopdongMouseClicked
 
    private void dichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dichvuMouseClicked
        try {
            // Mở form Home
            JFrameDichVu dichvu = new JFrameDichVu();
            dichvu.setVisible(true); // Hiển thị form Dịch vụ
            this.dispose(); // Đóng form hiện tại
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dichvuMouseClicked

    private void nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanvienMouseClicked
        try {
            // Mở form Home
            JFrameNhanVien nhanvien = new JFrameNhanVien();
            nhanvien.setVisible(true); // Hiển thị form Nhân viên
            this.dispose(); // Đóng form hiện tại
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nhanvienMouseClicked

    private void thanhtoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thanhtoanMouseClicked
        try {
            // Mở form Home
            JFrameThanhToan thanhtoan = new JFrameThanhToan();
            thanhtoan.setVisible(true); // Hiển thị form thanh toán
            this.dispose(); // Đóng form đăng nhập
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_thanhtoanMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Canho;
    private javax.swing.JLabel cudan;
    private javax.swing.JLabel dichvu;
    private javax.swing.JLabel hopdong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel nhanvien;
    private javax.swing.JLabel thanhtoan;
    // End of variables declaration//GEN-END:variables
}
