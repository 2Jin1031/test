package SwingProject;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        // JFrame의 제목 설정
        setTitle("ConntentPane과 JFrame");

        // 프로그램을 종료하기 위한 기본 종료 동작 설명
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JFrame의 cntentPane을 가져와서 배경색을 오렌지로 설정
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.PINK);

        // contentPane의 레이아웃 매니저를 FlowLayout으로 설정
        contentPane.setLayout(new FlowLayout());

        // contentPane에 세 개의 버튼 추가
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        // JFrame의 크기 설정
        setSize(300, 150);

        // JFrame을 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {

        // ContentPaneEx 객체를 생성하여 GUI를 시작
        new ContentPaneEx();
    }
}
