package FinalJavaTest.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx extends JFrame {

    private JLabel la = new JLabel();

    public KeyCodeEx() {
        setTitle("Key code 예제ㅣ F1키 : 초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            la.setText(e.getKeyText(e.getKeyCode()));

            if(e.getKeyChar() == '%')
                getContentPane().setBackground(Color.YELLOW);
            else if(e.getKeyCode() == KeyEvent.VK_F1)
                getContentPane().setBackground(Color.green);
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
