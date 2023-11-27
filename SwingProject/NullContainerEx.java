package SwingProject;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        // 팝업창 제목
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // 컨테이너 영역의 레이아웃 메니저를 null로 설정
        c.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        // 레이블의 위치
        la.setLocation(150, 50);
        // 레이블의 크기
        la.setSize(200, 50);
        // 레이블을 컨텐츠 영역에 추가
        c.add(la);

        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i)); // 버튼 생성
            b.setLocation(i*15, i*15);
            b.setSize(50, 20);
            c.add(b);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
