
import View.JframeLogin;

public class Main {
    public static void main(String[] args) {
        // Đảm bảo rằng JFrameLogin được tạo và hiển thị đầu tiên
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JframeLogin login = new JframeLogin();
                 login.setVisible(true);
                
            }
        });
    }
}
