package JAVA;
import javax.swing.*;
import java.awt.*;

class FlowLayoutEx1 extends JFrame {
    public FlowLayoutEx1() {
        setTitle("22011531 LeeJin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setLocation(300, 0); // 시작 위치를 (300, 0)으로 설정
        setSize(300, 200);
        setVisible(true);
    }

}

class BorderLayoutEx1 extends JFrame {
    public BorderLayoutEx1() {
        setTitle("22011531 LeeJin"); // 프레임의 타이틀  달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
        Container c = getContentPane();
        c.setLayout(new BorderLayout(30, 20)); // 컨텐트팬에 BorderLayout 배치관리자 설정

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setPreferredSize(new Dimension(300, calculateButton.getPreferredSize().height)); // 150은 가로 폭을 나타냅니다.
        c.add(calculateButton, BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200); // 프레임 크기 300×200 설정
        setVisible(true); // 프레임을 화면에 출력
    }
}


public class test {
    public static void main(String[] args) {
        new FlowLayoutEx1();
        new BorderLayoutEx1();
    }


}
