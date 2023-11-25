package SwingProject;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleExitExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Exit Example");

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 창이 닫힐 때 프로그램 종료
                System.exit(0);
            }
        });

        frame.getContentPane().add(closeButton);

        // 창을 닫을 때 프로그램 종료 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
