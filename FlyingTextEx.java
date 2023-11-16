import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
    private final int FLYING_UNIT = 10; // 레이블이 한 번 움직이는 단위는 10픽셀
    private JLabel helloLabel = new JLabel("HELLO"); // "HELLO" 레이블 컴포넌트

    public FlyingTextEx() {
        setTitle("22011531 LeeJin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null); // 컨텐트팬의 배치관리자 삭제

        // Set the "HELLO" label's initial position
        helloLabel.setLocation(50, 50);
        helloLabel.setSize(100, 20);
        c.add(helloLabel);

        // Add a MouseListener to the content pane to handle double-clicks
        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    // Move the "HELLO" label to the double-clicked location
                    helloLabel.setLocation(e.getX(), e.getY());
                }
            }
        });

        setSize(300, 300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus(); // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정

        // KeyListener code remains the same
        c.addKeyListener(new MyKeyListener());
    }

    // KeyListener class (same as in the original code)
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    helloLabel.setLocation(helloLabel.getX(), helloLabel.getY() - FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    helloLabel.setLocation(helloLabel.getX(), helloLabel.getY() + FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    helloLabel.setLocation(helloLabel.getX() - FLYING_UNIT, helloLabel.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    helloLabel.setLocation(helloLabel.getX() + FLYING_UNIT, helloLabel.getY());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
