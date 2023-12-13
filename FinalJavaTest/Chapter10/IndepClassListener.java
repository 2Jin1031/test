package FinalJavaTest.Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("되나"); // JButton : 마우스나 <Enter> 키로 버튼 선택
        btn.addActionListener(new MyActionListener());
        btn.setLocation(50, 15);
        //btn.setSize(200, 200);
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource(); // getSource() : 이벤트를 발생시킨 객체의 위치값을 가져옴
    if (b.getText().equals("되나"))
        b.setText("안되나");
    else
        b.setText("되나");
    }
}